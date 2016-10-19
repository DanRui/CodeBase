package com.dr.objects;

import java.io.Serializable;
import java.util.List;

/**
 * Created by danjack on 16/10/5.
 */
public class Player implements Serializable {

    private boolean isAI = false;

    private List<Card> cards;

    public boolean isAI() {
        return isAI;
    }

    public void setAI(boolean AI) {
        isAI = AI;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Player(boolean isAI, List<Card> cards) {
        this.isAI = isAI;
        this.cards = cards;
    }

    public Player() {}

}
