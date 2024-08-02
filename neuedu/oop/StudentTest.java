package com.neuedu.oop;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        //创建学生数组并用匿名对象初始化
        Student[] students = {new EnglishStudent("20240301","张三","男",21,86,95,92),
                new EnglishStudent("20240306","李四","男",22,92,97,79),
                new ComputerStudent("20240208","王五","男",21,86,94,68,90),
                new ComputerStudent("20240211","赵六","女",21,94,93,88,72),
                new LiteratureStudent("20240109","冯七","女",20,88,76,89,97)};

        //创建一个新的数组存放随机选出的学生
        Student[] array = new Student[students.length];

        for(int i = 0;i<array.length;i++){
            //用random随机生成0到4的随机整数
            int index = (int)(Math.random() * 5);
            //如果students[index]为空说明该下标被随机中过
            //重新随机下标index的值直到出现未被随机中的
            while(students[index] == null){
                index = (int)(Math.random() * 5);
            }
            //将学生数组中对应下标的元素放入新数组中
            array[i] = students[index];
            //将被选择过学生数组中的元素设置为空
            students[index] = null;
        }
        //遍历新产生的数组
        for (int i = 0; i < array.length; i++) {
            //调用方法打印学生信息
            new Student().getInstance(array[i]);
        }

    }
}
