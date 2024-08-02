package com.neuedu.work0726;

public class Player {
    /**
     * 静态变量被类中的对象共用
     */
    public static int sum = 1;

    /**
     * 创建球员的方法
     */
     private static void create() {
        System.out.println("创建了" + sum + "个球员");
    }

    /**
     * 空的构造方法
     */
    public Player() {
    }

    ;


    public static void main(String[] args) {
        while (sum <= 11) {
            new Player().create();
            new Player().sum++;
        }
        System.out.println("对不起，已经创建了11个球员。不能再创建球员了");

    }
}

