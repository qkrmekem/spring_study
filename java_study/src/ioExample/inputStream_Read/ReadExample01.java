package ioExample.inputStream_Read;

import input.InputDemo;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample01 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:/Temp/test.txt");
        int readByte;
        while((readByte=is.read()) != -1){
            System.out.println((char)readByte);
        }
        is.close();
    }
}
