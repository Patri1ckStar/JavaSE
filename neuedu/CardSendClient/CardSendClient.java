package com.neuedu.CardSendClient;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardSendClient {
    public static void main(String[] args) {
        new CardSendClient().paly();
    }

    public void paly(){
        List<Card> cards = createCard();
        createPlayer(cards);
        System.out.print(cards.get(cards.size() - 1) + " ");
        System.out.print(cards.get(cards.size() - 2) + " ");
        System.out.println(cards.get(cards.size() - 3));
    }

    private List<Card> createCard(){
        List<Card> cards = new ArrayList<>();
        for(int rank = Card.THREE; rank < Card.BLACK;rank++){
            for(int suit = Card.DIAMONDS; suit < Card.JOKER;suit++){
                Card card = new Card(suit,rank);
                cards.add(card);
            }
        }
        Card black = new Card(Card.JOKER,Card.BLACK);
        cards.add(black);
        Card color = new Card(Card.JOKER,Card.COLOR);
        cards.add(color);
        Collections.shuffle(cards);
        System.out.println(cards);
        return cards;
    }

    private void createPlayer(List<Card> cards){
        List<Player> players = new ArrayList<>();
        players.add(new Player("001","世殊"));
        players.add(new Player("002","湛汐"));
        players.add(new Player("003","歆慕"));

        for(int i = 0; i< cards.size() - 3; i++){
            Card card = cards.get(i);
            players.get(i%3).addCard(card);
        }
        players.forEach(System.out::println);
    }

}
