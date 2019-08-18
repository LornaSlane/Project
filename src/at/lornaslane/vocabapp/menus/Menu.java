package at.lornaslane.vocabapp.menus;

public abstract class Menu {
    protected String title;

    protected String getFormattedTitle() {
        return "\n--- " + this.title + " ---";
    }
}
