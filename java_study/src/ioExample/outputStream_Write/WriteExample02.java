package ioExample.outputStream_Write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample02 {
    public static void main(String[] args) throws Exception{
        OutputStream outputStream = new FileOutputStream("C:/Temp/test.txt");
        byte[] data = "한글도 되나 시험 중".getBytes();
        outputStream.write(data);
        outputStream.flush();
        outputStream.close();
    }
}
