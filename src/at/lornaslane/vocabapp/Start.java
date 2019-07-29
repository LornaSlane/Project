package at.lornaslane.vocabapp;

import at.lornaslane.vocabapp.menus.MainMenu;

public class Start {
    public static void main(String[] args) {

        DeckCollection myDeckCollection = new DeckCollection();
        new MainMenu(myDeckCollection);

    }
}