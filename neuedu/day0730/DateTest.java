package com.neuedu.day0730;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int monthBeijing = sc.nextInt();
        System.out.println("请输入日期");
        int dayBeijing = sc.nextInt();
        System.out.println("请输入小时");
        int hoursBeijing = sc.nextInt();
        int hoursP = hoursBeijing + 7;
        int hoursN = hoursBeijing + 12;

        System.out.println("北京时间：" + monthBeijing + "月" + dayBeijing + "日" + hoursBeijing + "时");
        //计算巴黎时间
        if (hoursP > 24) {
            int dayP = dayBeijing + 1;
            int monthP = monthBeijing;
            int houtsP = hoursBeijing + 7 - 24;
            System.out.println("巴黎时间为：" + monthP + "月" + dayP + "日" + houtsP + "时");
        } else {
            int dayP = dayBeijing;
            int monthP = monthBeijing;
            int houtsP = hoursBeijing + 7;
            System.out.println("巴黎时间为：" + monthP + "月" + dayP + "日" + houtsP + "时");
        }
        //计算纽约时间
        if (hoursN > 24) {
            int dayN = dayBeijing + 1;
            int monthN = monthBeijing;
            int houtsN = hoursBeijing + 12 - 24;
            System.out.println("纽约时间为：" + monthN + "月" + dayN + "日" + houtsN + "时");
        } else {
            int dayN = dayBeijing;
            int monthN = monthBeijing;
            int houtsN = hoursBeijing - 7;
            System.out.println("纽约时间为：" + monthN + "月" + dayN + "日" + houtsN + "时");

        }
    }
}
