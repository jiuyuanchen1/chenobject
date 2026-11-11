package cn.chen.stream;

public class Student {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private Integer classNumber;

    public Student(Integer id, String name, String sex, Integer age, Integer classNumber) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.classNumber = classNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }
}
