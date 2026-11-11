package cn.chen.duotai;

class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("ccccc");
    }
}
class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("dddddd");
    }
}

class Animal{

    public void run(){}

}

public class dt1
{
    public static void main(String[] args) {


        Animal cat = new Cat();//向上转型
        cat.run();


        System.out.println("*********************");

        Animal ct = new Cat();

        //向下强转
        if(ct instanceof Cat) {
            Cat cat1 = (Cat) ct;
            cat1.run();
        }
    }
}
