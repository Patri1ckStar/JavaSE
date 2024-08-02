package com.neuedu.work0726;

public class Circle extends Shape {
    /**
     * 半径
     */
    double radius;

    /**
     * 构造方法
     */
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * 带参数构造方法
     *
     * @param color  颜色
     * @param radius 半径
     */
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * 重写父类方法求圆的面积
     *
     * @return
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPer() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void showAll(Shape shape) {
        System.out.println("圆的为：" + this.radius);
        System.out.println("圆的面积为：" + this.getArea());
        System.out.println("圆的周长为：" + this.getPer());
        System.out.println(this.getColor(shape));
    }
}
