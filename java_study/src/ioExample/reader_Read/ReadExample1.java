package ioExample.reader_Read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/Temp/test.txt");
        int readData;
        while ((readData=reader.read()) != -1){
            System.out.println((char) readData);
        }
        reader.close();
    }
}
