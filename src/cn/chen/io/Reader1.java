package cn.chen.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流
 * @author chen
 */
public class Reader1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("iii.txt");

        char read = (char)fileReader.read();
        int ch;
        while ((ch=fileReader.read())!=-1) {
            System.out.println((char) ch);
        }
        fileReader.close();

    }




}
