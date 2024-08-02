package com.neuedu.work0726;

public class Vehicle {
    /**
     * 品牌
     */
    String brand;
    /**
     * 汽车颜色
     */
    String color;
    /**
     * 速度
     */
    private double speed;
    /**
     * 初始速度
     */
    final double ISPEED = 0;

    /**
     * 汽车跑起来的方法
     */
    public void run() {
        System.out.println("汽车能跑");
    }

    /**
     * 空的构造器
     */
    public Vehicle() {

    }

    /**
     * 构造方法
     *
     * @param brand 车的品牌
     * @param color 车的颜色
     */
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = ISPEED;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
