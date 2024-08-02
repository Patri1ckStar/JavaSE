package com.neuedu.work0726;

public abstract class Shape {
    /**
     * 面积
     */
    double area;
    /**
     * 周长
     */
    double per;
    /**
     * 颜色
     */
    String color;

    /**
     * 构造方法
     */
    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPer();

    public abstract void showAll(Shape shape);

    public String getColor(Shape shape) {
        return this.color;
    }
}
