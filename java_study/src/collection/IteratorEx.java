package collection;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
    //예제
    public static void main(String[] args) {
        // 정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        // Iterator를 이용하여 모든 정수 출력
        Iterator<Integer> it = v.iterator();
        // 다음 요소가 남아있으면 true
        while (it.hasNext()){
            //next() 다음 요소 리턴
            int n = it.next();
            System.out.println(n);
        }

        // Iterator를 이용하여 모든 정수 더하기
        int sum = 0;
        // Iterator를 다시 설정해줘야 함
        it = v.iterator();
        while (it.hasNext()){
            int n = it.next();
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }

    // Iterator 메소드
    // hasNext() : 방문할 요소가 남아 있으면 true
    // next() : 다음 요소 리턴
    // remove() : 마지막으로 리턴된 요소 제거
}
