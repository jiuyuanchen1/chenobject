package cn.chen.stream;

import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class Stream111 implements Serializable {


    public static long endTime;
    public static Date date;
    public static long startTime;
    public static long midTime;
    public static Calendar c;
    public static int time=24 * 60 *60;
    public static long tt;
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(6,4,7,9,3,2,8);

      list.stream().filter(x->x>6).forEach(System.out::println);
        Optional<Integer> first = list.stream().filter(x -> x > 6).findFirst();
        System.out.println(first.get());
        Optional<Integer> first1 = list.stream().filter(x -> x > 3).findAny();
        boolean b = list.stream().anyMatch(x -> x > 10);
        System.out.println(first1.get());
        System.out.println(b);
       /* List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());*/


//        Calendar calendar=Calendar.getInstance();
//        /*System.out.println(calendar.get(Calendar.ERA));
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        int i = calendar.get(Calendar.HOUR_OF_DAY);
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));*/
//        calendar.setTime(new Date());
//        System.out.println(calendar.getTime());
//
//        //System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//        calendar.add(Calendar.DATE,7);
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//        Date currentTime = new Date();
//        boolean before = currentTime.before(calendar.getTime());
//        System.out.println(calendar.getTime());
//        //calendar.add();
//
//
//        String a="0";
//        System.out.println(a.equals("0"));


         c=Calendar.getInstance();
         c.add(Calendar.DAY_OF_MONTH,-7);
        Date time = c.getTime();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(time);
        System.out.println(c.getTime());
        System.out.println(format);

        /*c.set(Calendar.YEAR,2024);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DAY_OF_MONTH,26);
        c.set(Calendar.HOUR_OF_DAY,11);
        c.set(Calendar.MINUTE,46);
        c.set(Calendar.SECOND,10);
        endTime = c.getTimeInMillis();
         date = new Date();
         startTime = date.getTime();
        System.out.println(c.getTime());
        System.out.println(date);
        tt= (endTime-startTime)/1000;
        System.out.println(tt);*/

        //天
         midTime=(endTime-startTime)/1000/24/60/60;

        time1();
        String title=null;
        if(title!=null||title!="")
        {
            System.out.println("字符串判空");
        }

    }

private static void time1(){
    System.out.println("进入"+tt);

 /*       while (tt>0)
        {

            tt--;
            System.out.println(tt);
            try {
                Thread.sleep(1000);
                long tian=tt/24/60/60;



                long hh=tt/60/60%24;
                long mm=tt/60%60;
                long ss=tt%60;
                System.out.println("还剩"+tian+"天"+hh+"小时"+mm+"分"+ss+"秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
}
}
