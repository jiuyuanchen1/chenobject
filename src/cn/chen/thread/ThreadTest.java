package cn.chen.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThreadTest {
    public static int number = 0;



    public static int evenSpanValue(int[] number) {
        // write code here
        int sum=0;
        for(int i=0;i<number.length;i++){
            int a=number[i];
            if(i+1<number.length){
                int b=number[i+1];
                int c=b-a;
                int d=c%2;
                if(d==0){
                    sum++;
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) throws InterruptedException {

        long timestamp = new Date().getTime();
        System.out.println( timestamp);
        int[] number= {1,3,6,9};
        int i = evenSpanValue(number);
        System.out.println(i);

        List<String> alist=new ArrayList<>();
        alist.add("7");
        for (String s : alist) {
            System.out.println("666");
        }


        String a="1754600001,17547,1764500004";
        String[] split = a.split(",");
        for (String s : split) {
            if(s.length()==5){
                System.out.println("s5s"+s);

            }else if (s.length()==10){

                System.out.println("s10s"+s.substring(0,5));
                System.out.println("s10s"+s.substring(5,10));

            }
        }












      /*  long timestamp = 1732673452000L; // 输入的时间戳
        Date date = new Date(timestamp);
        System.out.println(date);
       // 创建时间10:10:07  修改时间确认到货10:10:52   到货确认10:12:06  撤单10:38:09
        //27 10:57:13


        Object locker = new Object();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (locker) {
                    number++;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (locker) {
                    number++;
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(number);*/
    }


}
