package ioExample.system_in_out;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {
    public static void main(String[] args) throws IOException{
        OutputStream outputStream = System.out;

        // ascii코드를 이용한 0~9까지 출력하기
        for(byte b=48; b<58; b++){
            outputStream.write(b);
        }
        outputStream.flush();

        String korean = "가나다라마바사아자차타파하";
        byte[] koreanByte = korean.getBytes();
        outputStream.write(koreanByte);
        outputStream.flush();
    }
}
