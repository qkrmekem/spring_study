package ioExample.reader_Read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/Temp/test.txt");
        int readData;
        char[] chars = new char[2];
        String data = "";
        while ((readData=reader.read(chars)) != -1){
            data += new String(chars, 0, readData);
        }
        System.out.println(data);
        reader.close();
    }
}
