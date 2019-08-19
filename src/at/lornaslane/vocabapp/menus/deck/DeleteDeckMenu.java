package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.DeckCollection;

public class DeleteDeckMenu extends DeckMenu {
    public DeleteDeckMenu(DeckCollection myDeckCollection) {

        super("Delete");

        int enteredDeckNumber = myDeckCollection.selectDeck();

        myDeckCollection.remove((enteredDeckNumber - 1));
    }
}
