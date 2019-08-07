package at.lornaslane.vocabapp;

public class Card {
    private final String targetWord;
    private final String translation;
    private String targetLanguageCard;

    public Card(String pTargetWord, String pTranslation) {
        this.targetWord = pTargetWord;
        this.translation = pTranslation;
    }

    public String getTargetWord() {
        return targetWord;
    }
}
