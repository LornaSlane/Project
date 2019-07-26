package at.lornaslane.vocabapp;

import java.util.ArrayList;

public class DeckCollection {
    private ArrayList<Deck> decks;

    public DeckCollection() {
        decks = new ArrayList<Deck>();
    }

    public void add(Deck pDeck) {
        decks.add(pDeck);
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

}
