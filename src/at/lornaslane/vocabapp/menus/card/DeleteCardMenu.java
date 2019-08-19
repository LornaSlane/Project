package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.Deck;

public class DeleteCardMenu extends CardMenu {

    public DeleteCardMenu(Deck myDeck) {

        super("Delete");

        int enteredCardNumber = myDeck.selectCard();

        myDeck.remove((enteredCardNumber - 1));

        System.out.println("You successfully deleted a card from " + myDeck.getName() + ".");
    }
}
