package at.lornaslane.vocabapp.menus;

abstract class DefaultMenu extends Menu {
    @Override
    protected String getFormattedTitle() {
        return "\n--- " + this.title + " ---";
    }
}
