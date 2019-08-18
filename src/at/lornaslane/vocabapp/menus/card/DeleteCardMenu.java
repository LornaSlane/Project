package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.Deck;
import at.lornaslane.vocabapp.menus.Menu;

public class DeleteCardMenu extends Menu {

    public DeleteCardMenu(Deck myDeck) {

        // TODO: 2019-08-14 extend new card menu
        // TODO: 2019-08-14 add constructor chaining

        title = "Delete a Card";
        System.out.println(getFormattedTitle());

        int enteredCardNumber = myDeck.selectCard();

        myDeck.remove((enteredCardNumber - 1));

        System.out.println("You successfully deleted a card from " + myDeck.getName() + ".");
    }
}
