package com.neuedu.day29;

public class Account {
    /**
     * 账号
     */
    String account;
    /**
     * 余额
     */
    double balance;

    /**
     * 构造方法
     */
    public Account(){

    }

    /**
     * 构造方法
     * @param account 账户
     * @param balance 余额
     */
    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    /**
     * 存钱的方法
     * @param d 存入的金额
     * @return 返回余额
     */
    public double save(double d){
        balance = balance + d;
        System.out.println(this.balance);
        return balance;
    }

    /**
     * 取钱的方法
     * @param d 取钱的金额
     * @return 返回余额
     */
    public void pay(double d)throws Exception{
        balance = balance - d;
        if(balance < 0){
                throw new Exception("余额不足");
            }
        }

    }


