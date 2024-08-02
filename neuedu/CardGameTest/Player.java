package com.neuedu.CardGameTest;

import java.util.Arrays;

public class Player {
    String id;
    String name;
    Card[] cards = {};

    public Player() {

    }
    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + "," + name + Arrays.toString(cards);
    }

    public void creatCard(Card card){
        cards = Arrays.copyOf(cards, cards.length + 1);
        cards[cards.length - 1 ] = card;
    }

    public void sortCard(){
        Arrays.sort(cards);
    }
}
