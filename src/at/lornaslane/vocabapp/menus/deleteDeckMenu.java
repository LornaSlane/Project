package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.DeckCollection;

class deleteDeckMenu extends Menu {
    public deleteDeckMenu(DeckCollection myDeckCollection) {

        int enteredDeckNumber = myDeckCollection.selectDeck();

        myDeckCollection.remove((enteredDeckNumber - 1));


        }
    }
