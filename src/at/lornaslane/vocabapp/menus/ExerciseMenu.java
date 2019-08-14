package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Card;
import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.Exercise;

import java.util.ArrayList;

class ExerciseMenu extends Menu {

    public ExerciseMenu(DeckCollection myDeckCollection) {

        title = "Exercise Your Knowledge";

        int enteredDeckNumber = myDeckCollection.selectDeck();

        System.out.println("You have chosen to test your knowledge of " +
                myDeckCollection.getDecks().get(enteredDeckNumber - 1).getName() + ".");


        // TODO: 2019-08-07 Create testing

        ArrayList<Deck> allDecks = myDeckCollection.getDecks();
        Deck userSelectedDeck = allDecks.get(enteredDeckNumber - 1);

        System.out.println(userSelectedDeck.getName());
        System.out.println("--------");

        for (Card card : userSelectedDeck.getCardsInDeck()) {
            Exercise.testUser(card);

        }

        System.out.println("Well done! You completed the exercise!");

        // TODO: 2019-08-07 Create scoreboard

        // User is presented with the first target word of the deck and asked to provide the translation.
        // The user's input is tested against the translation and if it is correct the user is congratulated and
        // one point is added to the scoreboard.
        // If the user's input is wrong, the user is told so and give the correct answer.
        // No point is added to the scoreboard
    }
}
