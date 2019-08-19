package at.lornaslane.vocabapp.menus;

abstract class DefaultMenu extends Menu {

    DefaultMenu(String pTitle) {
        super(pTitle);
    }

    @Override
    protected String getFormattedTitle() {
        return "\n--- " + this.title + " ---";
    }
}
