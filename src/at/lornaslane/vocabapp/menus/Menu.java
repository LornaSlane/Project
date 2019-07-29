package at.lornaslane.vocabapp.menus;

public abstract class Menu {
    protected String title;

    public String getFormattedTitle() {
        return "\n--- " + this.title + " ---";
    }
}