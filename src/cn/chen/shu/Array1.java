package cn.chen.shu;

/**
 * 可变数组   int... nums
 * @author chen
 */
public class Array1 {
    public static int getSum(int... nums)

    {
        int sum=0;
        for (int n:nums
             ) {
            sum +=n;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 3, 3, 3, 3));
    }
}
