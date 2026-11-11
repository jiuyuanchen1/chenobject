package cn.chen.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream
 * 对文件进行操作
 * @author chen
 */
public class FileOut {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\test\\io.txt");
        //写数据
        fos.write(1);
        fos.close();
        //写字节数组
        byte[] bytes = "cxcz".getBytes();
        fos.write(bytes);
        //off第几个，len长度
        fos.write(bytes,3,1);

    }

}
