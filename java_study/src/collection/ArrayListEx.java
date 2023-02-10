package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    //예제
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<String> a = new ArrayList<String>();

        // 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<4;i++){
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next();
            // ArrayList 맨 뒤에 삽입
            a.add(s);
        }

        // ArrayList에 들어 있는 모든 이름(요소) 출력
        for (int i=0; i<a.size(); i++){
            // get(i) : ArrayList의 i번째 요소 가져오기
            String name = a.get(i);
            System.out.print(name + " ");
        }

        // 가장 긴 이름 출력
        int longestIndex = 0; // 가장 긴 이름의 인덱스 번호 저장
        for (int i=0; i<a.size(); i++){
            if(a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
        scanner.close();
    }

    // ArrayList 메서드
    // add(E element) : 맨 뒤에 element 삽입
    // add(int index, E element) : index위치에 element 삽입
    // addAll(Collection<E> c) : c의 모든 요소를 ArrayList의 맨 뒤에 추가
    // clear : ArrayList의 모든 요소 삭제
    // contains(Object o) :  ArrayList가 o를 포함하고 있으면 true 반환
    // elementAt(int index) : 인덱스의 요소 리턴
    // get(int index) : 인덱스의 요소 리턴
    // indexOf(Object o) : o와 같은 첫 번째 요소의 인덱스 리턴, 없으면 -1
    // isEmpty() : ArrayList가 비어 있으면 true
    // remove(int index) : 인덱스의 요소 삭제
    // remove(Object o) : o와 같은 첫 번째 요소 삭제
    // size() : ArrayList 크기 리턴
    // toArray() : ArrayList의 모든 요소를 포함하는 배열 리턴

}
