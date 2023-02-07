package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // 필드 주입 방법
//    @Autowired public final MemberService memberService;

    public MemberService memberService;

    //setter 주입 방법
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    //생성자 주입 방법 -> 주로 사용
//    public MemberController(MemberService memberService){
//        this.memberService = memberService;
//    }
}
