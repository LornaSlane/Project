package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.DeckCollection;

import java.util.Scanner;

public class MainMenu {

    public MainMenu() {
        // FIXME: 2019-07-26 Make sure menu does not end after one loop. 
        // To be refactored
        DeckCollection myDeckCollection = new DeckCollection();

        System.out.println("---Main Menu ---");
        System.out.println("Hello, Lorna. What would you like to do today?");
        System.out.println("Press 1 to create a new deck.");
        System.out.println("Press 2 to show my  decks.");
        System.out.print("Pick an option: ");

        Scanner sc = new Scanner(System.in);
        int option = Integer.parseInt(sc.nextLine());

        if (option == 1) {

            new DeckCreationMenu();

        }

        if (option == 2) {
            System.out.println(myDeckCollection.getDecks());
        }
    }
}
