package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.DeckCollection;

public class TestMenu extends Menu {

    public TestMenu(DeckCollection myDeckCollection) {
        int enteredDeckNumber = myDeckCollection.selectDeck();

        System.out.println("You have chosen to test your knowledge of " +
                myDeckCollection.getDecks().get(enteredDeckNumber - 1).getName() + ".");

        // TODO: 2019-08-07 Create testing
        // TODO: 2019-08-07 Create scoreboard

        // User is presented with the first target word of the deck and asked to provide the translation.
        // The user's input is tested against the translation and if it is correct the user is congratulated and
        // one point is added to the scoreboard.
        // If the user's input is wrong, the user is told so and give the correct answer.
        // No point is added to the scoreboard
    }

}
