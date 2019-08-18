package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.menus.Menu;

import java.util.Scanner;

public class CreateCardMenu extends Menu {

    public CreateCardMenu(Deck myDeck) {
        // TODO: 2019-08-14 extend new card menu
        // TODO: 2019-08-14 add constructor chaining
        title = "Create a Card";

        System.out.println(this.getFormattedTitle());
        System.out.println("What word would you like to learn?");
        System.out.print("Enter word: ");

        Scanner sc = new Scanner(System.in);
        String targetWord = sc.nextLine();

        System.out.println("What does \"" + targetWord + "\" mean in English?");
        System.out.print("Enter translation: ");

        String translation = sc.nextLine();

        Card myCard = new Card(targetWord, translation);
        System.out.println("Great! You successfully added the word \"" + targetWord + "\", meaning \"" + translation + "\".");
        myDeck.add(myCard);
    }
}
