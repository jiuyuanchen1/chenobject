package cn.chen.factory;

/**
 *
 * 普通工厂
 * @author chen
 */
abstract class BMW{
   // public BMW(){}
}



class BMW320 extends BMW{
    public BMW320()
    {
        System.out.println("制作BMW320");
    }
}
class BMW523 extends BMW{
    public BMW523()
    {
        System.out.printf("制作BMW523");
    }
}


//工厂方法模式
interface FactoryBMW{
    BMW careateBMW();
}

class FactoryBMW320 implements FactoryBMW{
    @Override
    public BMW careateBMW() {
        return new BMW320();
    }
}
class FactoryBMW523 implements FactoryBMW{
    @Override
    public BMW careateBMW() {
        return new BMW523();
    }
}


/*
普通工厂
class Factory{
    public BMW createBMW(int type)
    {
        switch (type)
        {
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }
}*/


public class Customer {
    public static void main(String[] args) {

//      Factory factory =new Factory();
//        BMW bmw = factory.createBMW(320);
//        BMW bmw1 = factory.createBMW(523);


        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW bmw = factoryBMW320.careateBMW();
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW bmw1 = factoryBMW523.careateBMW();
    }
}
