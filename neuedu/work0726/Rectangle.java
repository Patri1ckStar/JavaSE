package com.neuedu.work0726;

public class Rectangle extends Shape {
    /**
     * 长
     */
    double width;
    /**
     * 高
     */
    double height;

    /**
     * 构造方法
     */
    public Rectangle() {

    }

    /**
     * 带参构造方法
     *
     * @param width  长
     * @param height 宽
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /**
     * 重写父类求面积的方法
     *
     * @return
     */
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    /***
     * 重写父类求周长方法
     * @return
     */
    @Override
    public double getPer() {
        return 2 * (this.width + this.height);
    }

    @Override
    public void showAll(Shape shape) {
        System.out.println("矩形的长为：" + this.width);
        System.out.println("矩形的宽为：" + this.height);
        System.out.println("矩形的面积为：" + this.getArea());
        System.out.println("矩形的周长为：" + this.getPer());
        System.out.println(this.getColor(shape));
    }
}
