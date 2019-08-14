package at.lornaslane.vocabapp;

public class Card {
    // TODO: 2019-08-14 implement nameable interface (make SAM)
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
}
