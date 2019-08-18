package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.Deck;

public class DeleteCardMenu extends CardMenu {

    public DeleteCardMenu(Deck myDeck) {
        // TODO: 2019-08-14 add constructor chaining

        title = "Delete";
        System.out.println(this.getFormattedTitle());

        int enteredCardNumber = myDeck.selectCard();

        myDeck.remove((enteredCardNumber - 1));

        System.out.println("You successfully deleted a card from " + myDeck.getName() + ".");
    }
}
