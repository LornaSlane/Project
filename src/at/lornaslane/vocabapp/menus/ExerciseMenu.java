package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.Exercise;

class ExerciseMenu extends DefaultMenu {

    public ExerciseMenu(DeckCollection myDeckCollection) {

        title = "Test Your Knowledge";
        System.out.println(this.getFormattedTitle());

        int enteredDeckNumber = myDeckCollection.selectDeck();

        Deck selectedDeck = myDeckCollection.getDecks().get(enteredDeckNumber - 1);
        Exercise.testUser(selectedDeck);
    }
}
