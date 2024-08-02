package com.neuedu.CardGameTest2;

public class Card implements Comparable<Card>{
    /**
     * 花色
     */
    int suit;
    /**
     * 点数
     */
    int rank;
    /**
     * 创建存放花色的数组
     */
    public static final String[] SUITS = {"♦", "♣", "♥", "♠", ""};
    /**
     * 创建存放点数的数组
     */
    public static final String[] RANKS = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "小王", "大王"};

    /**
     * 花色点数一一对应
     */
    public static final int DIAMONDS = 0;
    public static final int CLUB = 1;
    public static final int HEART = 2;
    public static final int SPAND = 3;
    public static final int JOKER = 4;

    public static final int THREE = 0;
    public static final int FORE = 1;
    public static final int FIVE = 2;
    public static final int SIX = 3;
    public static final int SEVEN = 4;
    public static final int EIGHT = 5;
    public static final int NINE = 6;
    public static final int TEN = 7;
    public static final int JACK = 8;
    public static final int QUEEN = 9;
    public static final int KING = 10;
    public static final int ACE = 11;
    public static final int DEUCE = 12;
    public static final int BLACK = 13;
    public static final int COLOR = 14;


    /**
     * 构造方法
     */
    public Card(){

    }

    /**
     * 构造方法
     * @param suit 花色
     * @param rank 点数
     */
    public Card(int suit, int rank){
        if(suit < Card.DIAMONDS || suit>Card.JOKER){
            throw new RuntimeException("没有这种花色");
        }
        if(rank < Card.THREE || rank>Card.COLOR){
            throw new RuntimeException("没有这种点数");
        }
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return SUITS[suit] + RANKS[rank] + SUITS[suit];
    }

    @Override
    public int compareTo(Card card) {
       if(this.rank != card.rank){
           return this.rank - card.rank;
       }
       return this.suit - card.suit;
    }
}