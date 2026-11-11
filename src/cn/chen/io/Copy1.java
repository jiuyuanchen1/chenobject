package cn.chen.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * copy
 * 拷贝
 * @author chen
 */
public class Copy1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("xx");
        FileOutputStream fileOutputStream = new FileOutputStream("xx");

        byte[] bytes = new byte[1024];
        int read = fileInputStream.read(bytes);
        while (read!=-1)
        {
            //边读边写
            fileOutputStream.write(bytes,0,read);
            read=fileInputStream.read(bytes);
        }
        //先开后关
        fileOutputStream.close();
        fileInputStream.close();
    }
}
