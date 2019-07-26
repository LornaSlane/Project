package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Card;

import java.util.Scanner;

public class CardCreationMenu {
    public CardCreationMenu() {
        System.out.println("What's the first word you'd like to learn?");
        System.out.print("Enter word: ");

        Scanner sc = new Scanner(System.in);
        String targetWord = sc.nextLine();
        System.out.println(targetWord);

        System.out.println("What does this word mean in English?");
        System.out.print("Enter translation: ");

        String translation = sc.nextLine();
        System.out.println(translation);

        Card myCard = new Card(targetWord, translation);
        System.out.println(myCard);
    }
}
