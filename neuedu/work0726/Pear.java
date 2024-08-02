package com.neuedu.work0726;

public class Pear implements Fruit {
    /**
     * 构造方法
     */
    public Pear() {

    }

    /**
     * 对父类方法重写
     */
    @Override
    public void creatFruit() {
        System.out.println("创建了一个梨类的对象");
    }
}
