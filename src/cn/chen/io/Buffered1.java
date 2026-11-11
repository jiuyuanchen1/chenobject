package cn.chen.io;

import java.io.*;

/**
 * 字节缓冲流
 *
 * 字符缓冲流
 * readLine（）一次读一行
 * newLine();//换行
 * 减少io次数
 *
 * @author chen
 */
public class Buffered1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("xxx"));
        long l = System.currentTimeMillis();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("xxx"));

        //一次读一行
        String s = bufferedReader.readLine();
        bufferedInputStream.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("zx"));

        bufferedWriter.newLine();//换行
        bufferedWriter.close();
    }
}
