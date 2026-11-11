package cn.chen.shu;

import java.util.Arrays;

/**
 * @author chen
 */
public class ArrayMoed2 {
    public static void main(String[] args) {
        int[] arr = {4,8,9,7,3};
        //排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------");
        //二分查找
        int index = Arrays.binarySearch(arr,4);
        System.out.println(index);

        System.out.println("------------------");
        //深拷贝
        int[] ints = Arrays.copyOf(arr, 6);
        for (int i:ints
             ) {
            System.out.println(i);

        }
        boolean equals = Arrays.equals(arr, ints);

    }
}
