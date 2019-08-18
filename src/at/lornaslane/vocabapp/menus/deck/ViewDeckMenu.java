package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.menus.Menu;

import java.util.ArrayList;

public class ViewDeckMenu extends DeckMenu {

    public ViewDeckMenu(DeckCollection myDeckCollection) {

        title =  "View";
        System.out.println(this.getFormattedTitle());

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
