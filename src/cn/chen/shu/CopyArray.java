package cn.chen.shu;

/**
 * 数组拷贝
 * @author chen
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,4,8};
        //浅拷贝  拷贝内存地址   arr与arr2共用一个内存地址
        int[] arr2 =arr;

        //深拷贝  在堆上重新开辟一个空间
        int[] arr3 =new int[arr.length];
        for(int i = 0; i < arr3.length; i++)
        {
            arr3[i] = arr[i];
        }
        System.out.println(arr[1]);
        System.out.println(arr3[1]);
    }
}
