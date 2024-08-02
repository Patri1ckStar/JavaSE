package com.neuedu.CardSendClient;

import java.util.Arrays;

public class Player {
    String id;
    String name;
    Card[] cards = {};

    /**
     * 构造方法
     */
    public Player() {

    }
    public Player(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + name + Arrays.toString(cards);
    }

    public void addCard(Card card){
        cards = Arrays.copyOf(cards, cards.length + 1);
        cards[cards.length - 1] = card;
    }
}
