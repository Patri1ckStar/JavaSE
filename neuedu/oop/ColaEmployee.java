package com.neuedu.oop;

public class ColaEmployee {
    /**
     * 定义员工的姓名
     */
    private String name;

    /**
     * 定义员工的生日所在月份
     */
    private int birthMonth;

    /**
     * 员工的基础工资
     */
    private double basicSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * 创建一个空的构造方法
     */
    public ColaEmployee() {

    }

    /**
     * 创建一个构造方法
     *
     * @param name       员工姓名
     * @param birthMonth 员工生日所在月份
     */
    public ColaEmployee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }

    /**
     * 先判断月份是否在1-12之间 如果在再判断当前月份是否式员工生日所在月份
     *
     * @param month 当前月份
     * @return 返回额外的工资金额
     */
    public double getSalary(int month) {
        if (month < 1 || month > 12) {
            return 0.0;
        }
        double extra = 100.0;
        if (this.birthMonth == month) {
            this.basicSalary = this.basicSalary + extra;
        }
        return this.basicSalary;
    }
}
