package com.neuedu.work0726;

public class Apple implements Fruit {
    /**
     * 构造函数
     */
    public Apple() {

    }

    /**
     * 重写接口中的创建水果方法
     */
    @Override
    public void creatFruit() {
        System.out.println("创建了一个苹果类的对象");

    }
}
