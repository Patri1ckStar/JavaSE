package com.neuedu.CardGameTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardSendClient {
    public static void main(String[] args) {
       new CardSendClient().play();

    }
    public void play(){
        List<Card> cards = creatCard();
        createPlayer(cards);
        System.out.print(cards.get(cards.size() - 1) + " ");
        System.out.print(cards.get(cards.size() - 2) + " ");
        System.out.println(cards.get(cards.size() - 3));
    }

    /**
     *创建54张牌并完成洗牌方法
     */
    private List<Card> creatCard(){
        List<Card> cards = new ArrayList<Card>();
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

    /**
     * 创建玩家的方法
     */
    private void createPlayer(List<Card> cards){
        List<Player> players = new ArrayList<>();
        players.add(new Player("001","熠之"));
        players.add(new Player("002","湛汐"));
        players.add(new Player("003","歆慕"));

        for(int i = 0; i< cards.size()-3;i++){
            Card card = cards.get(i);
            players.get(i%3).creatCard(card);
        }
        players.forEach(Player::sortCard);
        players.forEach(System.out::println);
    }
}
