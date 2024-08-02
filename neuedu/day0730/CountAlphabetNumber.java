package com.neuedu.day0730;

import java.util.Scanner;

public class CountAlphabetNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个由字母和数字组成的字符串");
        String str = sc.next();
        //调用方法
        count(str);
    }

    /**
     * 创建一个方法数数字和字母出现的次数
     * @param str 传入的字符串
     */
    public static void count(String str){
        int length = str.length();
        int countNumber = 0;
        int countAlphabet = 0;
        //拿到字符串中的每一个字符
        for(int i = 0; i < length; i++){
            char ch = str.charAt(i);
            //将字符强转成int类型   如果范围再48-57之间就为数字
            if((int)ch >= 48 && (int)ch <= 57){
                //出现的数字次数加一
                countNumber++;
            }
            //如果转换成int类型后在65-90之间就是A-Z，如果在97-122之间就是小写的a-z
            if(((int)ch >= 65 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <= 122)){
                //出现字母的次数加一
                countAlphabet++;
            }
        }
        System.out.println("数字出现" + countNumber + "次");
        System.out.println("字母出现" + countAlphabet + "次");
    }
}
