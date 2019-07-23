package at.lornaslane.vocabapp;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        DeckCollection myDeckCollection = new DeckCollection();

        while (true) {

            System.out.println("---Main Menu ---");
            System.out.println("Hello, Lorna. What would you like to do today?");
            System.out.println("Press 1 to create a new deck.");
            System.out.println("Press 2 to show my  decks.");
            System.out.print("Pick an option: ");

            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());

            if (option == 1) {
                System.out.println("\n--- Create a Deck ---");
                System.out.print("Name your deck: ");

                String deckName = sc.nextLine();

                Deck myDeck = new Deck(deckName);
                System.out.println(myDeck.getName());

                myDeckCollection.add(myDeck);

                System.out.println("What's the first word you'd like to learn?");
                System.out.print("Enter word: ");

                String targetWord = sc.nextLine();
                System.out.println(targetWord);

                System.out.println("What does this word mean in English?");
                System.out.print("Enter translation: ");

                String translation = sc.nextLine();
                System.out.println(translation);

                Card myCard = new Card(targetWord, translation);
                System.out.println(myCard);
            }

            if (option == 2) {
                System.out.println(myDeckCollection.getDecks());
            }
        }
    }
}
