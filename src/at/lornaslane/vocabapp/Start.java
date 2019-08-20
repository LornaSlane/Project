package at.lornaslane.vocabapp;

import at.lornaslane.vocabapp.menus.MainMenu;

class Start {

    private static final DeckCollection myDeckCollection = new DeckCollection();

    // Add predefined Scots decks
    static {
        Deck scots = new Deck("Scots") {
            @Override
            public String getName() {
                return this.name + " (predefined)";
            }
        };
        scots.add(new Card("auld", "old"));
        scots.add(new Card("aye", "yes"));
        scots.add(new Card("bahoochie", "backside"));
        scots.add(new Card("bairn", "child"));
        scots.add(new Card("blether", "chatter-box"));
        scots.add(new Card("bonnie", "beautiful"));
        scots.add(new Card("braw", "nice"));
        scots.add(new Card("chancer", "trickster"));
        scots.add(new Card("clarty", "dirty"));
        scots.add(new Card("dinnae", "don't"));
        scots.add(new Card("drookit", "soaking wet"));
        scots.add(new Card("eejit", "idiot"));
        scots.add(new Card("to girn", "to complain"));
        scots.add(new Card("glaekit", "stupid"));
        scots.add(new Card("guy", "very"));
        scots.add(new Card("to haver", "to talk nonsense"));
        scots.add(new Card("wee", "little"));
        scots.add(new Card("wee nyaff", "little nuisance"));
        myDeckCollection.add(scots);
    }

    // Add predefined Scots decks
    static {
        Deck spanish = new Deck("Spanish") {
            @Override
            public String getName() {
                return this.name + " (predefined)";
            }
        };

        spanish.add(new Card("perro", "dog"));
        myDeckCollection.add(spanish);
    }

    public static void main(String[] args) {
        new MainMenu(myDeckCollection);
    }
}
