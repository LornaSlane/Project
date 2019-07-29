package at.lornaslane.vocabapp;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cardsInDeck = new ArrayList<>();
    private String name;

    public Deck(String pName) {
        this.name = pName;
    }

    public void add(Card pCard) {
        cardsInDeck.add(pCard);
    }

    public String getName() {
        return name;
    }
}
