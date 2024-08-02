package com.neuedu.work0726;

public class PolyDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3, "blue");
        Shape circle = new Circle("red", 5);
        circle.showAll(circle);
        rectangle.showAll(rectangle);
    }
}
