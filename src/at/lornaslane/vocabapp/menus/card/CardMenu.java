package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.menus.Menu;

abstract class CardMenu extends Menu {
    @Override
    protected String getFormattedTitle() {
        return "\n--- " + this.title + " Card ---";
    }
}
