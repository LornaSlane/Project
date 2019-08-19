package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.menus.Menu;

abstract class CardMenu extends Menu {
    CardMenu(String pTitle) {
        super(pTitle);
    }

    @Override
    protected String getFormattedTitle() {
        return "\n--- " + this.title + " Card ---";
    }
}
