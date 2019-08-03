package at.lornaslane.vocabapp;

import java.util.ArrayList;

public class Card {
    private String targetWord;
    private String translation;
    private String targetLanguageCard;
    public Card (String pTargetWord, String pTranslation) {
        this.targetWord = pTargetWord;
        this.translation = pTranslation;
    }

    public String getTargetWord() {
        return targetWord;
    }

}
