package com.neuedu.day0730;

import java.util.Objects;

public class Student {
    /**
     * 学号
     */
    int id;
    /**
     * 学生姓名
     */
    String name;
    /**
     * 年龄
     */
    String sage;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "张三");
        Student s2 = new Student(1,"张三");
        System.out.println(s1.equals(s2));
    }


}
