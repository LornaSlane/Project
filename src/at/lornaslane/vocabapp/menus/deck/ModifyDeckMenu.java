package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.menus.card.AddCardMenu;
import at.lornaslane.vocabapp.menus.card.DeleteCardMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifyDeckMenu extends DeckMenu {
    public ModifyDeckMenu(DeckCollection myDeckCollection) {

        super("Modify");

        System.out.println("Enter a number to select a deck: ");

        int enteredDeckNumber = (myDeckCollection.selectDeck());

        ArrayList<Deck> allDecks = myDeckCollection.getDecks();

        Deck selectedDeck = allDecks.get(enteredDeckNumber -1);

        System.out.println("You successfully selected deck " + selectedDeck.getName() + ".");

        System.out.println("What would you like to do?");
        System.out.println("Press 1 to add a card.");
        System.out.println("Press 2 to delete a card.");

        Scanner sc = new Scanner(System.in);
        int option = Integer.parseInt(sc.nextLine().trim());



        switch (option) {
            case 1:
                new AddCardMenu(selectedDeck);
                break;
            case 2:
                new DeleteCardMenu(selectedDeck);
                break;

        }


    }

}
