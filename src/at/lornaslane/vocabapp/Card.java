package at.lornaslane.vocabapp;

public class Card implements Nameable {
    private final String targetWord;
    private final String translation;

    public Card(String pTargetWord, String pTranslation) {
        this.targetWord = pTargetWord;
        this.translation = pTranslation;
    }

    public String getTranslation() {
        return translation;
    }

    public String getTargetWord() {
        return targetWord;
    }

    @Override
    public String getName() {
        return targetWord + " – " + translation;
    }
}
