package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;

import java.util.Scanner;

public class CreateCardMenu extends CardMenu {

    public CreateCardMenu(Deck myDeck) {

        super("Create");

        System.out.println("What word would you like to learn?");
        System.out.print("Enter word: ");

        Scanner sc = new Scanner(System.in);
        String targetWord = sc.nextLine().trim();

        System.out.println("What does \"" + targetWord + "\" mean in English?");
        System.out.print("Enter translation: ");

        String translation = sc.nextLine().trim();

        Card myCard = new Card(targetWord, translation);
        System.out.println("Great! You successfully added the word \"" + targetWord + "\", meaning \"" + translation + "\".");
        myDeck.add(myCard);
    }
}
