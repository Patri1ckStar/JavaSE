package com.neuedu.day29;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("张三",3000);
        a.save(200);
        try {
            a.pay(5000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

