package cn.chen.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流
 * @author chen
 */
public class Wrider1 {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("wrider.txt");
        //一个一个写
        fileWriter.write(97);
        fileWriter.close();
        //字符数组写
        char[] chars = "xczcs".toCharArray();
        fileWriter.write(chars);
        //刷新
        fileWriter.flush();
        //关闭
        fileWriter.close();
    }
}
