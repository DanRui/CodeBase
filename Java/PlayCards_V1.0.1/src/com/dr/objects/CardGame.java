package com.dr.objects;

import com.dr.utils.GenerateCards;

import java.util.List;

/**
 * Created by danjack on 16/10/5.
 */
abstract public class CardGame {

    private List<Card> cards;

    private List<Player> players;

    private boolean isOver = false; // 牌局未结束

    public CardGame(boolean isOver, List<Player> players, List<Card> cards) {
        this.isOver = false;
        this.players = players;
        this.cards = cards;
    }

    public CardGame() {}

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setOver(boolean over) {
        isOver = over;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    abstract public void init();

    abstract public void run();

    abstract public boolean isOver();
}
