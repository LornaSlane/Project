package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;

import java.util.Scanner;

public class DeckCreationMenu {

    public DeckCreationMenu() {

        // To be refactored
        DeckCollection myDeckCollection = new DeckCollection();

        System.out.println("\n--- Create a Deck ---");
        System.out.print("Name your deck: ");

        Scanner sc = new Scanner(System.in);
        String deckName = sc.nextLine();

        Deck myDeck = new Deck(deckName);
        System.out.println(myDeck.getName());

        myDeckCollection.add(myDeck);

        new CardCreationMenu();
    }
}
