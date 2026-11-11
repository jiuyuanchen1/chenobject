package cn.chen.errey;

/**
 * Throw
 * 主动抛出异常
 * @author chen
 */
public class ThrowDemo {
    public static void test(int x,int y) throws Exception
    {
        if(y==0) {
            //用于参数检查
            throw new Exception("参数不为0");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        test(10,0);
        System.out.println("Hello world");
        System.out.println("Hello world");

    }
}
