package at.lornaslane.vocabapp.menus.card;

import at.lornaslane.vocabapp.Nameable;
import at.lornaslane.vocabapp.menus.Menu;

abstract class CardMenu extends Menu implements Nameable {
    CardMenu(String pTitle) {
        super(pTitle);
    }

    @Override
    protected String getFormattedTitle() {
        return "\n--- " + this.title + " Card ---";
    }

    @Override
    public String getName() {
        return this.title;
    }
}
