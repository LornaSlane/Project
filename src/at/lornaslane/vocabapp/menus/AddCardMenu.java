package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;

import java.util.Scanner;

class AddCardMenu extends Menu {
    AddCardMenu(Deck myDeck) {

        // TODO: 2019-08-14 extend new card menu
        // TODO: 2019-08-14 add constructor chaining
        title = "Add a New Card";
        System.out.println(getFormattedTitle());

        System.out.println("What word would you like to add?");
        System.out.print("Enter word: ");

        // TODO: 2019-08-14 extract method for user input including trim
        Scanner sc = new Scanner(System.in);
        String targetWord = sc.nextLine();

        System.out.println("What does \"" + targetWord + "\" mean in English?");
        System.out.print("Enter translation: ");

        String translation = sc.nextLine();

        Card myCard = new Card(targetWord, translation);
        System.out.println("Great! You successfully added the word \"" + targetWord + "\", meaning \"" + translation +
                "\" to the deck " + myDeck.getName() + ".");
        myDeck.add(myCard);
    }
}
