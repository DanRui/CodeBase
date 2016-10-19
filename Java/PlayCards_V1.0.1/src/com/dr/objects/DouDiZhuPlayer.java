package com.dr.objects;

import java.util.List;

/**
 * Created by danjack on 16/10/5.
 */
public class DouDiZhuPlayer extends Player {
    private boolean isDiZhu = false;

    public boolean isDiZhu() {
        return isDiZhu;
    }

    public void setDiZhu(boolean diZhu) {
        isDiZhu = diZhu;
    }

    public DouDiZhuPlayer(boolean isDiZhu, boolean isAI, List<Card> cards) {
        super(isAI, cards);
        this.isDiZhu = isDiZhu;
    }

    public boolean play(List<Card> cards) {
        List<Card> hand_cards = this.getCards(); // 现在手中的牌
        if (cards.size() > hand_cards.size()) {
            return false;
        }
        if (!hand_cards.containsAll(cards)) {
            return false;
        }
        hand_cards.removeAll(cards);
        this.setCards(hand_cards); // 更新手牌
        return true;
    }
}
