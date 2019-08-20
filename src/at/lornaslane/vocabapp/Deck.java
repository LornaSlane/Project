package at.lornaslane.vocabapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Deck implements Nameable {

    private final ArrayList<Card> cardsInDeck = new ArrayList<>();
    final String name;

    public Deck(String pName) {
        this.name = pName;
    }

    public ArrayList<Card> getCardsInDeck() {
        return cardsInDeck;
    }

    public void add(Card pCard) {
        cardsInDeck.add(pCard);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int selectCard() {
        int cardSelected = 0;

        do {
            System.out.println("Chose one of the following cards: ");
            int counter = 1;
            for (Card myCard : this.getCardsInDeck()) {
                System.out.println(counter + ". " + myCard.getTargetWord());
                counter++;
            }
            System.out.print("Enter a number: ");

            Scanner sc = new Scanner(System.in);

            try {
                cardSelected = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            if (cardSelected > cardsInDeck.size() || cardSelected < 1) {
                System.out.println("Invalid input.");
                cardSelected = 0;
            }
        } while (cardSelected == 0);

        return cardSelected;

    }

    public void remove(int pCardIndex) {
        cardsInDeck.remove(pCardIndex);
    }
}
