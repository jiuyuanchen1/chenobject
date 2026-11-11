package cn.chen.shu;

public class Array {
    public static void main(String[] args) {
        int[] a= new int[5];
        //byte int short long float double char boolean
        for (int i = 0;i<a.length;i++ )
        {
            a[i] = i;
        }
        for (int i = 0;i<a.length;i++ )
        {

            System.out.println(a[i]);
        }
        //可以遍历数组和集合
        for (int aa:a
             ) {
            System.out.println(aa);

        }
    }
}
