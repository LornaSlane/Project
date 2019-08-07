package at.lornaslane.vocabapp.menus;

import at.lornaslane.vocabapp.Deck;

class DeleteCardMenu extends Menu {

    public DeleteCardMenu(Deck myDeck) {

        title = "Delete a Card";
        System.out.println(getFormattedTitle());

        int enteredCardNumber = myDeck.selectCard();

        myDeck.remove((enteredCardNumber - 1));

        System.out.println("You successfully deleted a card from " + myDeck.getName() + ".");
    }
}
