package com.neuedu.oop;

public class SalariedEmployee extends ColaEmployee {

    /**
     * 定义员工的月工资
     */
    private double monthlySalary;

    /**
     * 创建空的构造方法
     */
    public SalariedEmployee() {

    }

    /**
     * 带参构造方法
     *
     * @param name          员工姓名
     * @param birthMonth    员工生日所在月份
     * @param monthlySalary 员工月工资
     */
    public SalariedEmployee(String name, int birthMonth, double monthlySalary) {
        super(name, birthMonth);
        this.monthlySalary = monthlySalary;
    }

    /**
     * 对父类算工资的方法重写
     *
     * @param month 当前月份
     * @return 返回工资
     */
    @Override
    public double getSalary(int month) {
        return this.monthlySalary = this.monthlySalary + super.getSalary(month);
    }
}
