package at.lornaslane.vocabapp;

import java.util.ArrayList;

public class DeckCollection {
    ArrayList<Deck> decks;

    public DeckCollection() {
        decks = new ArrayList<Deck>();
    }

    void add(Deck pDeck) {
        decks.add(pDeck);
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

}
