package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.DeckCollection;

class DeleteDeckMenu extends Menu {
    public DeleteDeckMenu(DeckCollection myDeckCollection) {

        int enteredDeckNumber = myDeckCollection.selectDeck();

        myDeckCollection.remove((enteredDeckNumber - 1));


        }
    }
