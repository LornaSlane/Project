package at.lornaslane.vocabapp.menus.deck;

import at.lornaslane.vocabapp.menus.Menu;

abstract class DeckMenu extends Menu {
    @Override
    protected String getFormattedTitle() {
        return "\n--- " + this.title + " Deck ---";
    }
}
