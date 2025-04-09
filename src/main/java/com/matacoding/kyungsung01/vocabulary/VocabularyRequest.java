// VocabularyRequest.java
package com.matacoding.kyungsung01.vocabulary;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VocabularyRequest {
    private String originalText;
    private String translatedText;
    private String targetLanguage;
}

