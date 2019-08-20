package at.lornaslane.vocabapp.menus;

public abstract class Menu {
    protected final String title;

    protected Menu(String pTitle) {
        this.title = pTitle;

        if (!this.title.equals("")) {
            System.out.println(this.getFormattedTitle());
        }
    }

    protected abstract String getFormattedTitle();
}
