package cn.chen.objct;

/**
 * @author chen
 */
class HungrySingleton{
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    HungrySingleton()
    {}
    public static HungrySingleton getInstance()
    {
        return hungrySingleton;
    }
}


class Lazysingleton{
    private static Lazysingleton lazysingleton;
    Lazysingleton(){}
    public static Lazysingleton getInstance(){
        if(lazysingleton==null)
        {
            synchronized (Lazysingleton.class){
                if(lazysingleton==null) {
                    return lazysingleton = new Lazysingleton();
                }
            }
        }
        return lazysingleton;
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person person2 = new Person("chen",10);
        Class<? extends Person> aClass = person2.getClass();//返回引用中存储的实际对象类型
        Person person4 = new Person("chen",10);

        System.out.println(person2.equals(person4));

        System.out.println("*********");
        Person person = Person.getPerson();
        Person person1 = Person.getPerson();
        System.out.println(person==person1);

        //返回对象的哈希值：这个对象的地址
        System.out.println("p"+person.hashCode());
        System.out.println("p2"+person1.hashCode());
        System.out.println("************");
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1 = HungrySingleton.getInstance();
        System.out.println(instance==instance1);

        Lazysingleton instance2 = Lazysingleton.getInstance();
        Lazysingleton instance3 = Lazysingleton.getInstance();
        System.out.println(instance2==instance3);


        //==比较内存地址

    }
}
