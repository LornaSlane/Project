package at.lornaslane.vocabapp;

import at.lornaslane.vocabapp.Card;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card>  cardsInDeck = new ArrayList<>();
    private String name;

    Deck (String pName) {
        this.name = pName;
    }

    public String getName() {
        return name;
    }
}
