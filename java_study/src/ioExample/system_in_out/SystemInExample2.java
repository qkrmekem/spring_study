package ioExample.system_in_out;

import java.io.InputStream;

public class SystemInExample2 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;

        byte[] data = new byte[100];

        System.out.print("이름 : ");
        int nameBytes = inputStream.read(data);
        String name = new String(data, 0, nameBytes - 2);

        System.out.print("하고 싶은 말 : ");
        int commentBytes = inputStream.read(data);
        String comment = new String(data, 0, commentBytes - 2);

        System.out.println("입력한 이름 : " + name);
        System.out.println("입력한 이름 : " + comment);
    }
}
