package com.neuedu.day0730;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CharacterPivotDate {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期   yyyy-MM-dd");
        String str = sc.nextLine();
        //输入的标准
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //输出的标准
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        try {
            Date date = sdf.parse(str);
            String str2 = sdf2.format(date);
            System.out.println(str2);
        }catch(Exception e){
            System.out.println("输入时间格式错误");
        }
    }
}

