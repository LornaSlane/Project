package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;

import java.util.Scanner;

public class MainMenu extends Menu {

    public MainMenu(DeckCollection myDeckCollection) {

        title = "Main Menu";

        while (true) {
            // TODO: 2019-07-30 add default case
            // TODO: 2019-07-30 add exception handling
            // TODO: 2019-07-29 Look at phrasing
            System.out.println(this.getFormattedTitle());
            System.out.println("Hello, Lorna. What would you like to do today?");
            System.out.println("Press 1 to create a new deck.");
            System.out.println("Press 2 to show my decks.");
            // TODO: 2019-07-29 Edit deck (including adding and deleting a card)
            // TODO: 2019-07-29 Test a deck (last)
            System.out.println("Press 3 to delete a deck.");
            System.out.println("Press 4 to exit.");
            System.out.print("Pick an option: ");

            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    new DeckCreationMenu(myDeckCollection);
                    break;
                case 2:
                    "\n--- Your Decks ---"
                    int counter = 1;
                    for (Deck deck : myDeckCollection.getDecks()) {
                        System.out.println(counter + ". " + deck.getName());
                        counter++;
                    }
                    break;
                case 3:
                    new deleteDeckMenu(myDeckCollection);
                    break;
                case 4:
                    System.out.println("Bye, bye!");
                    System.exit(0);
                    break;
            }
        }
    }
}
