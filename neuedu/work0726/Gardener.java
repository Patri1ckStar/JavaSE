package com.neuedu.work0726;

import java.util.Scanner;

public class Gardener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一种水果");
        String fruit = sc.next();
        if ("苹果".equals(fruit)) {
            new Apple().creatFruit();
        } else if ("梨".equals(fruit)) {
            new Pear().creatFruit();
        } else if ("桔子".equals(fruit)) {
            new Orange().creatFruit();
        } else {
            System.out.println("没有" + fruit);
        }


    }

}
