package cn.chen.thread;

import java.time.LocalDateTime;

public class ThreadSleep {

    //#### 锁释放时机代码演示
    public static void main(String[] args) {





















/*
        String name="上海市-上海市市本级-";
        int length = name.length();
        String substring = name.substring(length - 1, length);
        System.out.println(substring);
       *//* if (name.contains("本级")) {
            String name1 = name.substring(name.lastIndexOf('-') + 1);
            System.out.println(name1);

            //return jtdaAreaMapper.selectByNameNew(name);
        }*//*


        Object o = new Object();
        Thread thread = new Thread(() -> {
            synchronized (o) {
                System.out.println("新线程获取锁时间：" + LocalDateTime.now() + " 新线程名称：" + Thread.currentThread().getName());
                try {

                    //wait 释放cpu同时释放锁
                    o.wait(2000);

                    //sleep 释放cpu不释放锁
                    //Thread.sleep(2000);
                    System.out.println("新线程获取释放锁锁时间：" + LocalDateTime.now() + " 新线程名称：" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("主线程获取锁时间：" + LocalDateTime.now() + " 主线程名称：" + Thread.currentThread().getName());

        synchronized (o){
            System.out.println("主线程获取释放锁锁时间：" + LocalDateTime.now() + " 主线程名称：" + Thread.currentThread().getName());
        }*/
    }
}
