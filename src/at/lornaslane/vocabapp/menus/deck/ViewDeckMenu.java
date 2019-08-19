package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;

import java.util.ArrayList;

public class ViewDeckMenu extends DeckMenu {

    public ViewDeckMenu(DeckCollection myDeckCollection) {

        super("View");

        System.out.println("Which deck would you like to view?");

        int option = myDeckCollection.selectDeck();

        ArrayList<Deck> allDecks = myDeckCollection.getDecks();
        Deck userSelectedDeck = allDecks.get(option - 1);

        System.out.println("\n" + userSelectedDeck.getName());
        System.out.println("--------");

        for (Card card : userSelectedDeck.getCardsInDeck()) {
            System.out.println(card.getName());
        }
    }
}
