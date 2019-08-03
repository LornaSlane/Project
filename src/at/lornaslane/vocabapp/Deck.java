package at.lornaslane.vocabapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Deck {

    private final ArrayList<Card> cardsInDeck = new ArrayList<>();
    private final String name;
    public Deck(String pName) {
        this.name = pName;
    }

    public ArrayList<Card> getCardsInDeck() {
        return cardsInDeck;
    }

    public void add(Card pCard) {
        cardsInDeck.add(pCard);
    }

    public String getName() {
        return name;
    }

    public int selectCard() {
        System.out.println("Chose one of the following cards: ");
        int counter = 1;
        for (Card myCard : this.getCardsInDeck()) {
            System.out.println(counter + ". " + myCard.getTargetWord());
            counter++;
        }
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void remove(int pCardIndex) {
        cardsInDeck.remove(pCardIndex);
    }
}
