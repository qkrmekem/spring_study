package ioExample.writer_Write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test.txt");
        char[] data = "빨리 좀 나와라".toCharArray();
        writer.write(data);
        writer.flush();
        writer.close();
    }
}
