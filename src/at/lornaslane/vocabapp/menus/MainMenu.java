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
            System.out.println("Press 2 to show my decks.");
            System.out.println("Press 3 to delete a deck.");
            System.out.println("Press 4 to modify a deck.");
            System.out.println("Press 5 to test your knowledge!");
            System.out.println("Press 6 to exit.");
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
                    new ShowDeckMenu(myDeckCollection);
                    break;
                case 3:
                    new DeleteDeckMenu(myDeckCollection);
                    break;
                case 4:
                    new ModifyDeckMenu(myDeckCollection);
                    break;
                case 5:
                    new TestMenu(myDeckCollection);
                    break;
                case 6:
                    System.out.println("Bye, bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number from 1 - " + numberOfOptions + ".");
            }
        }
    }
}
