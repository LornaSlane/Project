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


    // FIXME: 2019-08-07 Error handling for wrong input

    public int selectDeck() {
        System.out.println("Chose one of the following decks: ");
        int counter = 1;
        for (Deck deck : getDecks()) {
            System.out.println(counter + ". " + deck.getName());
            counter++;
        }
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
