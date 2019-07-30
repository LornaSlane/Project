package at.lornaslane.vocabapp;

import java.util.ArrayList;

public class Deck {

    private final ArrayList<Card> cardsInDeck = new ArrayList<>();
    private final String name;
    public Deck(String pName) {
        this.name = pName;
    }

    public ArrayList<Card> getCardsInDeck() {
        return cardsInDeck;
    }

    public void add(Card pCard) {
        cardsInDeck.add(pCard);
    }

    public String getName() {
        return name;
    }
}
