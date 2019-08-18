package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.DeckCollection;
import at.lornaslane.vocabapp.menus.Menu;

public class DeleteDeckMenu extends DeckMenu {
    public DeleteDeckMenu(DeckCollection myDeckCollection) {

        int enteredDeckNumber = myDeckCollection.selectDeck();

        myDeckCollection.remove((enteredDeckNumber - 1));
    }
}
