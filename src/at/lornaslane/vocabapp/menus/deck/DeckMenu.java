package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.Nameable;
import at.lornaslane.vocabapp.menus.Menu;

abstract class DeckMenu extends Menu implements Nameable {
    DeckMenu(String pTitle) {
        super(pTitle);
    }

    @Override
    protected String getFormattedTitle() {
        return "\n--- " + this.title + " Deck ---";
    }

    @Override
    public String getName() {
        return this.title;
    }
}
