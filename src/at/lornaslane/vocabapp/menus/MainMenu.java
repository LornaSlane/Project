package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.DeckCollection;

import java.util.Scanner;

public class MainMenu extends Menu {

    public MainMenu(DeckCollection myDeckCollection) {

        title = "Main Menu";

        while (true) {
            // TODO: 2019-07-29 Look at phrasing
            System.out.println(this.getFormattedTitle());
            System.out.println("Hello, Lorna. What would you like to do today?");
            System.out.println("Press 1 to create a new deck.");
            System.out.println("Press 2 to show my decks.");
            // TODO: 2019-07-29 Edit deck (including adding and deleting a card)
            // TODO: 2019-07-29 Test a deck
            System.out.println("Press 3 to exit");
            System.out.print("Pick an option: ");

            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    new DeckCreationMenu(myDeckCollection);
                    break;
                // TODO: 2019-07-29 Show actual deck names (loop through the deck - with numbering).
                case 2:
                    System.out.println(myDeckCollection.getDecks());
                    break;
                case 3:
                    System.out.println("Bye, bye!");
                    System.exit(0);
                    break;
            }
        }
    }
}
