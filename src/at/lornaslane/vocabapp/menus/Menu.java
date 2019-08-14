package at.lornaslane.vocabapp.menus;

abstract class Menu {
    String title;

    String getFormattedTitle() {
        return "\n--- " + this.title + " ---";
    }

}