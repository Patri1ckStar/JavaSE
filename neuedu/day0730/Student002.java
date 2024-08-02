package com.neuedu.day0730;

import java.util.Objects;

public class Student002 {
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

    public Student002(int id, String name, String sage) {
        this.id = id;
        this.name = name;
        this.sage = sage;
    }
    public Student002(){

    }

    public static void main(String[] args) {
        Student002 s1 = new Student002(1, "张三","18");
        Student002 s2 = new Student002(1,"张三","19");
        s1.getage();
    }
    public  void getage(){
        int age = Integer.parseInt(this.sage) + 1;
        System.out.println(age);
    }

}

