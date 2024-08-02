package com.neuedu.oop;

public class SalesEmployee extends ColaEmployee {
    /**
     * 该类员工的月销售额
     */
    private double monthlySales;

    /**
     * 该类员工的提成率
     */
    private double commission;

    /**
     * 空的构造方法
     */
    public SalesEmployee() {

    }

    /**
     * 有参数的构造方法
     *
     * @param name         员工姓名
     * @param birthMonth   员工生日所在月份
     * @param monthlySales 员工当月的月销售额
     * @param commission   员工的提成率
     */
    public SalesEmployee(String name, int birthMonth, double monthlySales, double commission) {
        super(name, birthMonth);
        this.monthlySales = monthlySales;
        this.commission = commission;
    }

    /**
     * 对父类方法进行重写
     *
     * @param month 当前月份
     * @return
     */
    @Override
    public double getSalary(int month) {
        return this.monthlySales * this.commission + super.getSalary(month);
    }
}
