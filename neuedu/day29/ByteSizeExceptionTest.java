package com.neuedu.day29;

import java.util.Scanner;

public class ByteSizeExceptionTest {
    public static void main(String[] args) {
       try {
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入一个数");
           int number = sc.nextInt();
           checkByteSize(number);
           System.out.println(number + "是byte类型");
       }catch (ByteSizeException e){
           System.out.println(e.getMessage());
       }
    }

    public static void checkByteSize(int number) throws ByteSizeException{
        if(number < -128 || number > 127){
            throw new ByteSizeException(number + "不是byte类型");
        }
    }
}
