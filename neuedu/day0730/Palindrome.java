package com.neuedu.day0730;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int number = sc.nextInt();
        int temp = number;

        int sum = 0;
        while(number != 0){
            int num = number % 10;
            number = number / 10;
            sum = sum * 10 + num;
        }
        if(temp == sum){
            System.out.println(temp + "是回文数");
            return;
        }
        System.out.println(temp + "不是回文数");
    }
}
