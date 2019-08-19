package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.menus.deck.CreateDeckMenu;
import at.lornaslane.vocabapp.menus.deck.DeleteDeckMenu;
import at.lornaslane.vocabapp.menus.deck.ModifyDeckMenu;
import at.lornaslane.vocabapp.menus.deck.ViewDeckMenu;

import java.util.Scanner;

public class MainMenu extends DefaultMenu {

    private static final int NUMBER_OF_OPTIONS = 5;

    public MainMenu(DeckCollection myDeckCollection) {

        title = "Main Menu";

        while (true) {
            System.out.println(this.getFormattedTitle());
            System.out.println("Press 1 to create a new deck.");
            System.out.println("Press 2 to view a decks.");
            System.out.println("Press 3 to delete a deck.");
            System.out.println("Press 4 to modify a deck.");
            System.out.println("Press 5 to test your knowledge.");
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
                    new CreateDeckMenu(myDeckCollection);
                    break;
                case 2:
                    new ViewDeckMenu(myDeckCollection);
                    break;
                case 3:
                    new DeleteDeckMenu(myDeckCollection);
                    break;
                case 4:
                    new ModifyDeckMenu(myDeckCollection);
                    break;
                case 5:
                    new ExerciseMenu(myDeckCollection);
                    break;
                case 6:
                    System.out.println("Bye, bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number from 1 - " + NUMBER_OF_OPTIONS + ".");
                    break;
            }
        }
    }
}
