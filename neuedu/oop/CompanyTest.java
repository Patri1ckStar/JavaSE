package com.neuedu.oop;

import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args) {
        //创建员工数组并初始化
        ColaEmployee[] colaEmployees = {new SalariedEmployee("张三", 5, 5000.00),
                new HourlyEmployee("李四", 3, 20.0, 160.0),
                new SalesEmployee("李四", 8, 3_000_000.00, 0.001)};
        Scanner sc = new Scanner(System.in);
        //接收从键盘输入的月份
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        //遍历数组取出数组中的每个员工
        for (ColaEmployee colaEmployee : colaEmployees) {
            //调用方法求员工工资
            Company.getInstance(month, colaEmployee);
        }
    }
}
