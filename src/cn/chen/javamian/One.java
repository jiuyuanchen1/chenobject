package cn.chen.javamian;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author chen
 */
public class One implements Serializable {
    public static void main(String[] args) {
//        System.out.println(fun(7));
//        System.out.println(list(1, 200));
//        System.out.println(888 / 100);
//        System.out.println(shouxianhua(153));
        Date date1 = new Date(); // 当前时间
        Date date2 = new Date(); // 当前时间

        // 假设date2代表的时间稍晚于date1
        date2.setTime(date2.getTime() - 1000); // date2增加1000毫秒

        if (date1.before(date2)) {
            System.out.println("date1 is before date2");
        } else if (date1.after(date2)) {
            System.out.println("date1 is after date2");
        } else {
            System.out.println("date1 is equal to date2");
        }

    }








    public static int fun(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fun(n - 1) + fun(n - 2);
        }
    }



    public static List list(int n, int m) {
        List<Integer> l = new ArrayList();
        for (int i = n; i <= m; i++) {
            for (int j = 2; j <= i; j++) {
                if (i != j && i % j == 0) {
                    break;
                }
                if (i == j && i % j == 0) {
                    l.add(i);
                }

            }
        }
        return l;
    }
//水仙花数
    public static boolean shouxianhua(int n) {
        if (n > 999 || n < 100) {
            System.out.println("请输入一个三位数");
            return false;
        }
        else {
            int a = n / 100;
            int b = (n - a*100) / 10;
            int c = n % 10;
            if (a * a * a + b * b * b + c * c * c == n) {

                return true;
            }
            else { return false;}

        }
    }
}
