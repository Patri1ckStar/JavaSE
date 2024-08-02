package com.neuedu.oop;

public class Company {
    public static void getInstance(int month, ColaEmployee colaEmployee) {
        System.out.println(month + "月" + colaEmployee.getName() + "的工资为：" + colaEmployee.getSalary(month));
    }
}
