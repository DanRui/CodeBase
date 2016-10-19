package com.dr.test;

import com.dr.objects.Card;
import com.dr.utils.GenerateCards;

import java.util.List;

/**
 * Created by danjack on 16/10/5.
 */
public class TestGenerateCards {
    public static void main (String[] args) {
        List<Card> cards = GenerateCards.initializeGame();
    }
}
