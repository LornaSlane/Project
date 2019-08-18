package at.lornaslane.vocabapp;

import java.util.Scanner;

public class Exercise {

    private static void testUser(Card testedCard) {

        for (int triesLeft = 2; triesLeft >= 0; triesLeft--) {

            System.out.println("Enter the translation for \"" + testedCard.getTargetWord() + "\":");

            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.nextLine();

            if (userAnswer.equals(testedCard.getTranslation())) {
                System.out.println("Correct! You get a cookie!");
                break;
            } else if (triesLeft > 1) {
                System.out.println("Oh no! Try again! You have " + triesLeft + " tries left.");
            } else if (triesLeft == 1) {
                System.out.println("Oh no! Try again! You have " + triesLeft + " try left.");
            } else {
                System.out.println("Oh no! The correct translation would have been \"" + testedCard.getTranslation() + "\". Try the next one!");
            }
        }
    }

    public static void testUser(Deck userSelectedDeck) {
        System.out.println("You have chosen to test your knowledge of " + userSelectedDeck.getName() + ".");

        System.out.println(userSelectedDeck.getName());
        System.out.println("--------");

        for (Card card : userSelectedDeck.getCardsInDeck()) {
            Exercise.testUser(card);
        }

        System.out.println("Well done! You completed the exercise!");
    }
}
