package com.neuedu.day0730;

import java.util.Scanner;

public class ChangeAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个由小写字母组成的字符串");
        String str = sc.nextLine();
        //调用方法
        changeAlphabet(str);
    }

    /**
     * 将传入的字母变成该字母后的第三个字母
     * @param str 传入的字符串
     */
    public static void changeAlphabet(String str) {
        int length = str.length();
        StringBuilder s = new StringBuilder(str);
        //拿到字符串中每个字符
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            //强转成int类型+3后再转回char类型
            int number = (int)c + 3;
            char character = (char)number;
            s.setCharAt(i, character);
        }
        System.out.println(s.toString());

    }
}
