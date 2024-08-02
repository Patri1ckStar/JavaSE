package com.neuedu.day0730;

import java.util.Scanner;

public class CountE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        //输出调用方法的结果
        System.out.println(countE(str));

        }

    /**
     * 创建一个呃方法数字符串中出现的“e”的次数
      * @param str 传入的字符串
     * @return e出现的次数
     */
    public static int countE(String str){
        int count = 0;
        int length = str.length();
        //拿到字符串的每个字符
        for(int i = 0; i< length; i++){
            //如果字符串中出现e
            if(str.charAt(i) == 'e'){
                //出现e的次数加一
                count++;
            }
        }
        return count;
    }



}




