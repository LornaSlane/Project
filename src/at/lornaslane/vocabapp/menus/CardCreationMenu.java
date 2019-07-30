package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;

import java.util.Scanner;

class CardCreationMenu extends Menu {
    CardCreationMenu(Deck myDeck) {
        title = "Create a Card";

        System.out.println(this.getFormattedTitle());
        System.out.println("What word would you like to learn?");
        System.out.print("Enter word: ");

        Scanner sc = new Scanner(System.in);
        String targetWord = sc.nextLine();

        System.out.println("What does " + targetWord + " mean in English?");
        System.out.print("Enter translation: ");

        String translation = sc.nextLine();
        // TODO: 2019-07-29 Make it sound prettier (as above)
        System.out.println(translation);

        Card myCard = new Card(targetWord, translation);
        System.out.println(myCard);
        myDeck.add(myCard);
    }
}
