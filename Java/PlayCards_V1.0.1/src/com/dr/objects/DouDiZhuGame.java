package com.dr.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by danjack on 16/10/5.
 */
public class DouDiZhuGame extends CardGame {

    private List<Card> bottom_cards = new ArrayList<Card>();

    public List<Card> getBottom_cards() {
        return bottom_cards;
    }

    public void setBottom_cards(List<Card> bottom_cards) {
        this.bottom_cards = bottom_cards;
    }

    @Override
    public void init() {
        // 初始化发牌
        List<Player> players = this.getPlayers();
        if (players.size() == 1 || players.size() == 2 || players.size() > 3) {
            this.setOver(true);
        }
        List<Card> cards = this.getCards();
        bottom_cards.add(cards.get(cards.size()-3));
        bottom_cards.add(cards.get(cards.size()-2));
        bottom_cards.add(cards.get(cards.size()-1));
        cards.removeAll(bottom_cards); //移除底牌后发给玩家
        int card_counts = cards.size() / players.size();
        for (int i = 0 ; i < 3 ; i ++) {
            List<Card> tmp = cards.subList(card_counts * i, card_counts * (i + 1));
            players.get(i).setCards(tmp);
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        int dizhu = random.nextInt(3);
        List<Player> players = this.getPlayers();
        DouDiZhuPlayer player = (DouDiZhuPlayer)players.get(dizhu);
        player.setDiZhu(true);
        player.getCards().addAll(bottom_cards);

        while (!this.isOver() && !this.isOver()) {
            System.out.println("游戏已启动,请地主出牌......");
            Scanner scanner = new Scanner(System.in);

        }


    }

    @Override
    public boolean isOver() {
        for (Player player : this.getPlayers()) {
            if (player.getCards().size() == 0) {
                return true;
            }
        }
        return false;
    }
}
