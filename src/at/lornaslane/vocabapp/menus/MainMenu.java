package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.menus.deck.CreateDeckMenu;
import at.lornaslane.vocabapp.menus.deck.DeleteDeckMenu;
import at.lornaslane.vocabapp.menus.deck.ModifyDeckMenu;
import at.lornaslane.vocabapp.menus.deck.ViewDeckMenu;

import java.util.Scanner;

public class MainMenu extends DefaultMenu {

    private static final String[] MENU_OPTIONS = {
            "create a new deck",
            "view a deck",
            "delete a deck",
            "modify a deck",
            "test your knowledge",
            "exit"
    };

    public MainMenu(DeckCollection myDeckCollection) {

        super("");

        while (true) {
            System.out.println("\n--- Main Menu ---");

            int optionCounter = 0;
            for (String option :
                    MENU_OPTIONS) {
                optionCounter++;
                System.out.println("Press " + optionCounter + " to " + option + ".");
            }

            System.out.print("Pick an option: ");

            Scanner sc = new Scanner(System.in);

            int option = 0;
            try {
                option = Integer.parseInt(sc.nextLine().trim());
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
                    System.out.println("Please enter a number from 1 - " + MENU_OPTIONS.length + ".");
                    break;
            }
        }
    }
}
