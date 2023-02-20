package ioExample.writer_Write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test.txt");
        char[] data = "왜 결과가 안나오냐".toCharArray();
        for (int i=0;i< data.length;i++){
            writer.write(data[i]);
        }
        writer.flush();
        writer.close();
    }
}
