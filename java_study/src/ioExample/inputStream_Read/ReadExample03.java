package ioExample.inputStream_Read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample03 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("C:/Temp/test.txt");
        int readByteNo;
        byte[] readBytes = new byte[8];
        readByteNo = inputStream.read(readBytes, 2, 3);
        for (int i = 0; i<readBytes.length; i++){
            System.out.println(readBytes[i]);
        }
        inputStream.close(); 

    }
}
