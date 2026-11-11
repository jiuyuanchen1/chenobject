package cn.chen.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream333 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "张三", "男", 20, 2));
        studentList.add(new Student(2, "李四", "男", 21, 1));
        studentList.add(new Student(3, "王五", "女", 19, 1));
        studentList.add(new Student(4, "赵六", "男", 19, 1));
        studentList.add(new Student(5, "王大锤", "男", 20, 2));

        List<Student1> collect = studentList.stream().collect(Collectors.groupingBy(Student::getSex)).values().stream()
                .map(group -> group.get(0))
                .map(sc -> new Student1(sc.getId(), sc.getName())).collect(Collectors.toList());

        for (Student1 c:collect)
        {
            System.out.println(c.getId());
        }

    }
}
