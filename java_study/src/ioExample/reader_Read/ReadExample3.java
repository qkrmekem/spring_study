package ioExample.reader_Read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/Temp/test.txt");
        int readCharNo;
        char[] chars = new char[4];
        readCharNo = reader.read(chars, 2, 2);
        for (int i=0; i<chars.length;i++){
            System.out.println(chars[i]);
        }
        reader.close();
    }
}
