package cn.chen.feng_zhuang;

/**
 * @author chen
 */
class Person
{
    public Person(){
        System.out.println("this is a Person");
    }
    protected int getPrice()
    {
        return 30;
    }
}



public class WapperDemo extends Person{

    protected int getPrice(int page)
    {
        return 10;
    }



public static   String name="tom";
public WapperDemo()
{
    super();

    System.out.println("this is a teacher");

}

public void dds(){
}
    public void dds1(){
    this.dds();
    }

    public static void main(String[] args) {


    int i3=12;
   // i3+=i3-=i3*=i3;
    int i4=i3+i3-i3*i3;

        System.out.println(i4);



        String s2=null;
        if(s2==null)
        {
            System.out.println("1");
        }



        WapperDemo wapperDemo = new WapperDemo();


        Integer integer = new Integer(4);
        Integer integer1 = Integer.valueOf(6);
        //可以以面向对象的方式写
        int i = integer.intValue();

        int a=34;
        String s =a+" ";
        String b="56";
     int i1 = Integer.parseInt(b);
        System.out.println(i1);
        char[] v={'c','b','t'};
        String s1 = new String(v);

        String str = "ads";
        char c = str.charAt(2);
        System.out.println(c);
        boolean ad = str.contains("ad");
        System.out.println(ad);
        //以结尾
        boolean b1 = str.endsWith(".213");
        System.out.println(b1);
        //以开头
        boolean ad1 = str.startsWith("ad");



        //比较
        boolean ads = str.equals("ads");
        System.out.println(ads);
        boolean aDs = str.equalsIgnoreCase("ADs");
        System.out.println(aDs);

    }


}





