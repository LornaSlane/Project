package at.lornaslane.vocabapp;

import at.lornaslane.vocabapp.menus.MainMenu;

class Start {
    public static void main(String[] args) {

        DeckCollection myDeckCollection = new DeckCollection();

        Deck scots = new Deck("Scots");
        scots.add(new Card("dug", "dog"));
        myDeckCollection.add(scots);

        Deck spanish = new Deck("Spanish");
        scots.add(new Card("perro", "dog"));
        myDeckCollection.add(spanish);

        new MainMenu(myDeckCollection);
    }
}