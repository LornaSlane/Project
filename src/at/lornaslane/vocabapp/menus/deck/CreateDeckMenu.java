package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.menus.Menu;
import at.lornaslane.vocabapp.menus.card.CreateCardMenu;

import java.util.Scanner;

public class CreateDeckMenu extends Menu {

    public CreateDeckMenu(DeckCollection myDeckCollection) {

        title = "Create a Deck";

        System.out.println(this.getFormattedTitle());
        System.out.print("Name your deck: ");

        Scanner sc = new Scanner(System.in);
        String deckName = sc.nextLine();

        Deck myDeck = new Deck(deckName);

        myDeckCollection.add(myDeck);

        System.out.println("You have successfully created the deck " + myDeck.getName() + "!");

        new CreateCardMenu(myDeck);
    }
}
