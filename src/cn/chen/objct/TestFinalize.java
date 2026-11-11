package cn.chen.objct;

public class TestFinalize {
    public static void main(String[] args) {
        new Student();
        new Student();
        new Student();
        System.gc();
    }
}
