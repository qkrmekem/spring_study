package ioExample.outputStream_Write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample01{
    public static void main(String[] args) throws Exception{
        OutputStream out = new FileOutputStream("C:/Temp/test.txt");
        byte[] data = "ABC".getBytes();
        for (int i=0; i<data.length; i++){
            out.write(data[i]);
        }
        // write 이후 프로그램이 끝나면 data가 파일에 입력이 되지만
        // 프로그램이 끝나지 않고 다른 작업이 이뤄질 경우 data는 버퍼에 남아있게 됨
        // 때문에 flush를 이용해 버퍼를 비워줘야함
        out.flush();
        out.close();
    }
}
