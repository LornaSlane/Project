package at.lornaslane.vocabapp;

import java.util.Scanner;

public class Exercise {

    public static void testUserOnCard(Card testedCard) {
        System.out.println("Enter the translation for \"" + testedCard.getTargetWord() + "\":");

        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();

        if (userAnswer.equals(testedCard.getTranslation())) {
            System.out.println("Correct! You get a cookie!");
        } else {
            System.out.println("Oh no! Try again!");
        }
    }
}
