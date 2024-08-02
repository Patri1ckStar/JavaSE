package com.neuedu.CardGameTest2;

import java.util.Arrays;

public class Player {
    int id;
    String name;
    Card[] cards = {};

    /**
     * 创建一个身份数组
     */
    public static final String[] ID = {"地主","农民"};

    public static final int LANDLORD = 0;
    public static final int FARMER = 1;


    /**
     * 构造方法
     */
    public Player(){

    }
    /**
     * 构造方法
     */
    public Player(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return ID[id] + " " + name +Arrays.toString(cards);
    }

    public void sortCard(){
        Arrays.sort(cards);
    }

    public void addCard(Card card){
        cards = Arrays.copyOf(cards, cards.length + 1);
        cards[cards.length - 1] = card;
    }
}
