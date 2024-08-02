package com.neuedu.day0730;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        System.out.println("请输入一个字符串");
        String str2 = sc.next();
        System.out.println(str1 + "+" + str2+ "=" + (str1 + str2));
    }
}
