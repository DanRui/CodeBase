package com.dr.utils;

import com.dr.objects.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Generate 54 cards with different colors and numbers.
 * Created by danjack on 16/10/5.
 */
public class GenerateCards {

    public static List<Card> initializeGame () {
        List<Card> cards = new ArrayList<Card>();
        String[] dots = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0 ; i < 4 ; i ++) {
            for (int j = 0 ; j < dots.length ; j ++) {
            	Card card = new Card(dots[j], i);
                if (!cards.contains(card)) {
                    cards.add(card);
                }
            }
        }
        cards.add(new Card("King", 4));
        cards.add(new Card("Queen", 4));
        System.out.println(cards);
        Collections.shuffle(cards, new Random(20));
        System.out.println(cards);
        return cards;
    }
}
