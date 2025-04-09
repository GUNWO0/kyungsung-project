// VocabularyResponse.java
package com.matacoding.kyungsung01.vocabulary;

import lombok.Getter;

@Getter
public class VocabularyResponse {
    private final String originalText;
    private final String translatedText;
    private final String targetLanguage;

    public VocabularyResponse(Vocabulary vocab) {
        this.originalText = vocab.getOriginalText();
        this.translatedText = vocab.getTranslatedText();
        this.targetLanguage = vocab.getTargetLanguage();
    }
}
