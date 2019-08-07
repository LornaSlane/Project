package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;

import java.util.Scanner;

public class MainMenu extends Menu {

    public MainMenu(DeckCollection myDeckCollection) {

        title = "Main Menu";
        final int numberOfOptions = 5;

        while (true) {
            System.out.println(this.getFormattedTitle());
            System.out.println("Press 1 to create a new deck.");
            // TODO: 2019-08-07 Option to show all cards 
            System.out.println("Press 2 to show my decks.");
            // TODO: 2019-07-29 Test a deck (last)
            System.out.println("Press 3 to delete a deck.");
            System.out.println("Press 4 to modify a deck.");
            System.out.println("Press 5 to exit.");
            System.out.print("Pick an option: ");

            Scanner sc = new Scanner(System.in);

            int option = 0;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }

            switch (option) {
                case 1:
                    new DeckCreationMenu(myDeckCollection);
                    break;
                case 2:
                    System.out.println("\n--- Your Decks ---");
                    int counter = 1;
                    for (Deck deck : myDeckCollection.getDecks()) {
                        System.out.println(counter + ". " + deck.getName());
                        counter++;
                    }
                    break;
                case 3:
                    new DeleteDeckMenu(myDeckCollection);
                    break;
                case 4:
                    new ModifyDeckMenu(myDeckCollection);
                    break;
                case 5:
                    System.out.println("Bye, bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number from 1 - " + numberOfOptions + ".");
            }
        }
    }
}
