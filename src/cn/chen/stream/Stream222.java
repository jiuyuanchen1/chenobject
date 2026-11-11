package cn.chen.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

public class Stream222 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa bbb ccc");
        list.add("ddd eee fff");
        list.add("ggg hhh iii");

        list = list.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).collect(toList());
        System.out.println(list);
//
//        List<Test1> test1s=new ArrayList<>();
//        for(int i=0;i<200000;i++)
//        {
//            Test1 test1=new Test1();
//            test1.setName("c");
//            test1.setSum(i);
//            test1.setSe("b");
//            test1s.add(test1);
//        }
//        int sums=0;
//        Calendar calendar= Calendar.getInstance();
//
//
//        Date startDate=new Date();
//        long time = startDate.getTime();
//        calendar.setTime(startDate);
//
//        System.out.println(startDate);
//        for (int i=0;i<200000;i++)
//        {
//
//            sums=sums+test1s.get(i).getSum();
//        }
//        System.out.println(sums);
//        Date endDate=new Date();
//        long time1 = endDate.getTime();
//        long s = time1-time;
//        System.out.println(s);
//

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while (numbers.size() < 3) {
            int randomNumber = random.nextInt(6) + 1;
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

        System.out.println("随机生成的三个数字是：" + numbers.get(0) + ", " + numbers.get(1) + ", " + numbers.get(2));


    }
}
