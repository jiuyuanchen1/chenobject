package cn.chen.errey;

/**
 * throws按照方法的调用面反向传递
 *
 * 子类不能抛出比父类更大的异常
 * @author chen
 */
public class  ExcptionDemo  {



    public static double math(double x, int y)
    {
        x /=++y;
        return x;
    }
    ExcptionDemo(){

    }
    public static void test() throws Exception
    {
        int div = 10/0;
    }
    public static void main(String[] args) throws Exception {
        double math = math(2.0, 4);
        System.out.println(math);
    }
}
