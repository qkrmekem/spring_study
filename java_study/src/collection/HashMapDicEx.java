package collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>(); // 해시맵 생성

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("찾고 싶은 단어는?");
            String eng = sc.next();
            if (eng.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }
            // 해시맵에서 eng(키)의 값 검색
            String kor = dic.get(eng);
            if (kor == null)
                System.out.println(eng + "없는 단어입니다.");
            else
                System.out.println(kor);
        }
        sc.close();
    }

    // clear() : 해시맵의 모든 요소 삭제
    // containsKey(Object key) : 지정된 키를 포함하고 있으면 true 리턴
    // containsValue(Object Value) : 지정된 값에 일치하는 '키'가 있으면 true 리턴
    // get(Object key) : key의 값을 리턴, 없으면 null 리턴
    // isEmpty() : 해시맵이 비어있으면 true
    // keySet() : 해시맵의 모든 '키'를 담은 Set<K> 컬렉션 리턴
    // put(K key, V value) : key와 value쌍을 해시맵에 저장
    // remove(Object key) : 지정된 키를 찾아 키와 값 모두 삭제
    // size() : 해시맵의 요소 개수 리턴
}
