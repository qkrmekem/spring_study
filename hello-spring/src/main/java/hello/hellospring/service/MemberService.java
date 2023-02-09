package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;


    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /*
    * 회원가입
    * */
    public Long join(Member member){
        // 같은 이름이 있는 중복 회원X
        // ifPresent(변수) : 변수에 값이 있으면
        validateDuplicateMember(member); // 중복회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    //ctrl + alt + m : 메소드로 추출
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    /*
    * 전체 회원 조회
    * 서비스에서 메서드 이름 등은 주로 비즈니스에 가까운 네이밍을 하고
    * 리포지토리에서의 이름은 개발쪽에 가까운 네이밍을 함
    * */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
