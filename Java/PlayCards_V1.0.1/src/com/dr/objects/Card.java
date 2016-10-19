package com.dr.objects;

/**
 * Created by danjack on 16/10/5.
 */
public class Card {

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;

    private int color;

    public Card(String number, int color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.number + ":" + this.color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            if (this.color == (((Card) obj).color) && ((Card) obj).number.equals(this.number)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
