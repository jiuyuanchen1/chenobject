package cn.chen.io;

import java.io.File;
import java.io.IOException;

/**
 * File
 * 对文件或文件夹进行操作
 * @author chen
 */
public class FileIO {
    //递归调用
    public static void printOir(File dir)
    {
        if(dir.isFile())
        {
            System.out.println(dir);
        }
        else {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isFile())
                {
                    System.out.println(file);
                }
                else
                {
                    printOir(file);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        File file = new File("D:\\test\\io.txt");
        //路径
        System.out.println(file.getAbsolutePath());
        //名字
        System.out.println(file.getName());
        //大小
        System.out.println(file.length());
        //判断文件是否存在
        boolean exists = file.exists();
        //删除文件
        file.delete();
        //创建文件
        file.createNewFile();
        //判断文件和目录
        file.isFile();
        file.isDirectory();

        //创建目录
        file.mkdir();
        //名字
        String[] list = file.list();
        //绝对路径
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }


    }
}
