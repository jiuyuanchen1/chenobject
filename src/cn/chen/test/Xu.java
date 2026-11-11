package cn.chen.test;

import java.io.IOException;

/**
 * 序列化与反序列化
 *
 * @author chen
 */



public class Xu {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    /*    //序列化
        Class<One> oneClass = One.class;
        ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("iii.txt"));
        One one = new One();
        ob.writeObject(one);
        ob.close();
        //反序列化
        ObjectInputStream b = new ObjectInputStream(new FileInputStream("iii.txt"));
        One o = (One) objectInputStream.readObject();
        objectInputStream.close();*/

        System.out.println(5+10+"is");
        double a=3.14;
        int b=2;
        double c='A'+a+b;


    }
}




class CatChuan {
private String name;

    public CatChuan(String name) {
        this.name = name;
    }
}



class caat{
    private static caat c;
    caat(){}
    public caat getC()
    {
        synchronized (caat.class)
    {
        if(c==null)
        {
            if(c==null){
            c=new caat();
            return c;
            }
        }

        return c;
    }
    }
}