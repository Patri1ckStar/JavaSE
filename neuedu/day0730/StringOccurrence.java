package com.neuedu.day0730;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符");
        String srcString = sc.next();
        System.out.println("请输入子字符");
        String subString = sc.next();
        System.out.println(count(srcString, subString));
    }


    public static int count(String str, String sub){
        int count = 0;
        int lengthStr = str.length();
        int lengthSub = sub.length();
        for(int i = 0; i <= lengthStr - lengthSub; i++){
            int j;
            for(j = 0; j <lengthSub; j++){
                if(str.charAt(i+j) != sub.charAt(j)){
                    break;
                }
            }
            if(j == lengthSub){
                count++;
            }
        }
        return count;
    }

}
