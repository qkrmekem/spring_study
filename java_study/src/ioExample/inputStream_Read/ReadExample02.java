package ioExample.inputStream_Read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample02 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("C:/Temp/test.txt");
        int readByteNo;
        byte[] readBytes = new byte[3];
        String data = "";
        while ((readByteNo = inputStream.read(readBytes)) != -1){
            System.out.println(readByteNo);
            data += new String(readBytes, 0, readByteNo);
        }
        System.out.println(data);
        inputStream.close();
    }
}
