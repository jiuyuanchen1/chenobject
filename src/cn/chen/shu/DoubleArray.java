package cn.chen.shu;

/**
 * 二维数组
 * @author chen
 */
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,5},{3,5,7},{7,3,1}};

        for (int[] a:arr
             ) {
            for ( int c:a
                 ) {
                System.out.print(" "+c);

            }
            System.out.println();

             }

        for (int i = 0; i < arr.length; i++)
        {
            int[] arr1 = arr[i];
            for (int j = 0; j<arr1.length; j++)
            {
                System.out.print(arr1[j]);
            }
            System.out.println();
        }
    }
}
