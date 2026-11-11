package cn.chen.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 输入
 * @author chen
 */
public class FileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("iii.txt");
        char read = (char) fileInputStream.read();
        int c;
   /*     //一个字符一个字符的读
        while ((c=fileInputStream.read())!=1){
        System.out.println((char) c);}*/

        //读几个
        byte[] bytes = new byte[2];
        //有效字节个数
        int len;
        while ((len=fileInputStream.read(bytes))>0)
        {
            System.out.println(new String(bytes,0,len));



        }
    }
}
