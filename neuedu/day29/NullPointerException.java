package com.neuedu.day29;

public class NullPointerException {
    public static void main(String[] args) {
        String a = "sdafhsodjf";
        String b = null;
        try {
            checkString(a,b);
        }catch(java.lang.NullPointerException e){
            System.out.println(e);
        }
    }

    public static void checkString(String s1,String s2) throws java.lang.NullPointerException {
        if(s2 == null){
            throw new java.lang.NullPointerException("字符串不能为空");
        }
    }






}
