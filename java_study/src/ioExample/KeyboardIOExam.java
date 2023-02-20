package ioExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : System.in (InputStream 주인공)
        // 화면에 출력 : System.out (PrintStream 주인공)
        // 키보드로 입력받는다는 건 문자를 입력받는 것 : char 단위 입출력
        // char단위 입출력 클래스는 Reader, Writer
        // 한줄 읽기 : BufferedReader라는 클래스는 readLine이라는 메소드를 가지고 있음
        //           더 이상 읽어들일 것이 없으면(EOF) null을 반환
        //           장식의 역할을 함
        // 한줄 쓰기 : PrintStream, PrintWriter

        // BufferedReader는 사용 불가
        // CharReader 사용 불가 - 문자로부터 읽어들임
        // FilterReader 사용 불가 - 장식, Reader를 넣어줘야 함
        // InputStreamReader(InputStream in) - 장식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println("읽어들인 값 : " + line);
        }
    }
}
