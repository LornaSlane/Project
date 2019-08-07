package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowDeckMenu {

    public ShowDeckMenu(DeckCollection myDeckCollection) {
        System.out.println("\n--- Your Decks ---");
        int counter = 1;
        for (
                Deck deck : myDeckCollection.getDecks()) {
            System.out.println(counter + ". " + deck.getName());
            counter++;
        }
        System.out.println("Which deck would you like to view?");
        System.out.println("Enter the deck number: ");

        Scanner sc = new Scanner(System.in);
        int option = Integer.parseInt(sc.nextLine());

        ArrayList<Deck> allDecks = myDeckCollection.getDecks();
        Deck userSelectedDeck = allDecks.get(option - 1);

        System.out.println(userSelectedDeck.getName());
        System.out.println("--------");

        for (Card card: userSelectedDeck.getCardsInDeck()) {
            System.out.println(card.getTargetWord());
        }
    }

}
