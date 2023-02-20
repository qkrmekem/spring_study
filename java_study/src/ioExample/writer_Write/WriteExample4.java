package ioExample.writer_Write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test.txt");
        String str = "안녕 자바 프로그램";
        writer.write(str);
        writer.flush();
        writer.close();
    }
}
