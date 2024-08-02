package com.neuedu.day0730;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTurn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期  yyyy/MM/dd");
        String date = sc.nextLine();
        try {
            //调用方法如果输入的时间字符串符合要求输出true
            dateTurn(date);
            System.out.println("ture");
            //不符合要求捕获异常输出false
        }catch (ParseException e){
            System.out.println("false");
        }
    }

    /**
     * 将字符串转换成Date类型
     * @param string 传入的字符串
     * @throws ParseException 字符串不符合要求抛出异常
     */
    public static void dateTurn(String string) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(string);
    }
}
