package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;

import java.util.ArrayList;

class ShowDeckMenu extends Menu {

    public ShowDeckMenu(DeckCollection myDeckCollection) {

        title =  "Your Decks";
        System.out.println("Which deck would you like to view?");

        int option = myDeckCollection.selectDeck();

        ArrayList<Deck> allDecks = myDeckCollection.getDecks();
        Deck userSelectedDeck = allDecks.get(option - 1);

        System.out.println(userSelectedDeck.getName());
        System.out.println("--------");

        for (Card card : userSelectedDeck.getCardsInDeck()) {
            System.out.println(card.getTargetWord());
        }
    }
}
