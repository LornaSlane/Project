package at.lornaslane.vocabapp;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card>  cardsInDeck = new ArrayList<>();
    private String name;

    public Deck(String pName) {
        this.name = pName;
    }

    public String getName() {
        return name;
    }
}
