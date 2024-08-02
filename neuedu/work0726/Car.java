package com.neuedu.work0726;

public class Car extends Vehicle {
    /**
     * 载人数
     */
    int loader;

    /**
     * 构造方法
     */
    public Car() {

    }

    /**
     * 带参构造方法
     *
     * @param brand  品牌
     * @param color  颜色
     * @param loader 载客数
     */
    public Car(String brand, String color, int loader) {
        super(brand, color);
        this.loader = loader;
    }

    @Override
    public void run() {
        System.out.println("轿车不仅能跑，跑的还快");
    }

}
