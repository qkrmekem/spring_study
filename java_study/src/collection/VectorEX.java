package collection;

import java.util.Vector;

public class VectorEX {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        //벡터 맨 뒤에 삽입
        v.add(5);
        v.add(4);
        v.add(-1);

        //벡터 중간에 삽입(index,value)
        v.add(2,100);

        System.out.println("벡터 크기 : " + v.size());
        System.out.println("백터 현재 용량 : " + v.capacity());

        for (int i=0; i<v.size(); i++){
            //get(i) 벡터의 i번째 값
            int n = v.get(i);
            System.out.println(n);
        }

        for (int i=0; i<v.size(); i++){
            //elementAt(i) 벡터의 i번째 값
            int n = v.elementAt(i);
            System.out.println(n);
        }

        // addAll(Collection<E> c) : c의 모든 요소를 벡터의 맨 뒤에 추가
        // clear : 벡터의 모든 요소 삭제
        // contains(Object o) :  벡터가 o를 포함하고 있으면 true 반환
        // indexOf(Object o ) : o와 같은 첫 번째 요소의 인덱스 리턴, 없으면 -1
        // isEmpty() : 벡터가 비어 있으면 true
        // remove(int index) : 인덱스의 요소 삭제
        // remove(Object o) : o와 같은 첫 번째 요소 삭제
        // removeAllElements : 벡터의 모든 요소 삭제 후 크기를 0으로 설정
        // toArray() : 벡터의 모든 요소를 포함하는 배열 리턴
    }
}
