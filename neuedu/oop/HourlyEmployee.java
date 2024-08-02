package com.neuedu.oop;

public class HourlyEmployee extends ColaEmployee {
    /**
     * 时薪
     */
    private double hourlySalary;

    /**
     * 当月工作多少小时
     */
    private double hour;

    /**
     * 定义空的构造方法
     */
    public HourlyEmployee() {

    }

    /**
     * 创建带参数的构造器
     *
     * @param name         员工姓名
     * @param birthMonth   员工生日所在的月份
     * @param hourlySalary 员工的时薪
     * @param hour         员工当月工作了多少小时
     */
    public HourlyEmployee(String name, int birthMonth, double hourlySalary, double hour) {
        super(name, birthMonth);
        this.hourlySalary = hourlySalary;
        this.hour = hour;
    }

    @Override
    public double getSalary(int month) {
        if (hour > 160) {
            this.hourlySalary = 160 * this.hourlySalary + (hour - 160) * 1.5 * this.hourlySalary
                    + super.getSalary(month);
        }
        return this.hour * this.hourlySalary + super.getSalary(month);
    }
}
