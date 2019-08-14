package at.lornaslane.vocabapp;

import java.util.Scanner;

public class Exercise {

    public static void testUser(Card testedCard) {
        System.out.println("Enter the translation for \"" + testedCard.getTargetWord() + "\":");

        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();

        if (userAnswer.equals(testedCard.getTranslation())) {
            System.out.println("Correct! You get a cookie!");
        } else {
            System.out.println("Oh no! Try again!");

            // TODO: 2019-08-14 get user to try again two more times (classic for loop) 
            
        }
    }
    
    public static void testUser(Deck testedDeck) {
        // TODO: 2019-08-14 extract from exercise menu 
    }
}
