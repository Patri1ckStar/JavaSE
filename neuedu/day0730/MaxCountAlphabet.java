package com.neuedu.day0730;

import java.util.Scanner;

public class MaxCountAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个由大写字母和小写字母组成的字符串");
        String str = sc.nextLine();
        //调用方法
        count(str);
    }

    /**
     * 创建方法数大小写字母出现的个数并取最大值
     * @param str 传入的字符串
     */
    public static void count(String str){
        //大写字母出现的次数
        int m = 0;
        //小写字母出现的次数
        int n = 0;
        int length = str.length();
        //拿到字符串中每一个字符
        for(int i = 0; i <length; i++){
            //转换成int类型后如果在97-122之间为a-z
            if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122){
                //小写字母出现的次数加一
                n++;
            }
            //转换成int类型之后如果在65-90之间为A-Z
            if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90){
                //大写字母出现的次数加一
                m++;
            }
        }
        System.out.println(Math.max(m,n));
    }
}
