package cn.chen.errey;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 错误不可处理
 * 异常可处理
 * 1.运行时异常
 * 2.检查时异常
 *
 * @author chen
 */
public class ErreyDemo {
    public static void main(String[] args) {

        //编译器可以检查的异常
        try {
            //产生异常代码
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            //捕获异常

            e.printStackTrace();
        } finally {

            System.out.println("Hello world");
        }


    }
}
