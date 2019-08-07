package at.lornaslane.vocabapp;

import at.lornaslane.vocabapp.menus.MainMenu;

class Start {
    public static void main(String[] args) {

        DeckCollection myDeckCollection = new DeckCollection();

        // Adding predefined decks
        Deck scots = new Deck("Scots");
        scots.add(new Card("dug", "dog"));
        scots.add(new Card("bairn", "child"));
        myDeckCollection.add(scots);

        Deck spanish = new Deck("Spanish");
        spanish.add(new Card("perro", "dog"));
        myDeckCollection.add(spanish);

        new MainMenu(myDeckCollection);
    }
}