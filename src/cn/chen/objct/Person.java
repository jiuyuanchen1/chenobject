package cn.chen.objct;

import java.util.Objects;

/**
 * @author chen
 */


class Student{
    Student(){
        System.out.println("gc");
    }
}
public class Person {
    private String name;
    private int age;
    private static Person person = new Person();
    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
public static Person getPerson()
{
    return person;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
