package at.lornaslane.vocabapp;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckCollection {
    private final ArrayList<Deck> decks = new ArrayList<>();


    public void add(Deck pDeck) {
        decks.add(pDeck);
    }

    public void remove(int pDeckIndex) {
        decks.remove(pDeckIndex);
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

    public int selectDeck() {

        int deckSelected;

        // TODO: 2019-08-14 change to do while

        while (true) {
            System.out.println("Chose one of the following decks: ");
            int counter = 1;
            for (Deck deck : getDecks()) {
                System.out.println(counter + ". " + deck.getName());
                counter++;
            }
            System.out.print("Enter a number: ");

            Scanner sc = new Scanner(System.in);

            try {
                deckSelected = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            if (deckSelected > decks.size() || deckSelected == 0) {
                System.out.println("Invalid input.");
            } else {
                break;
            }
        }

        return deckSelected;
    }
}

