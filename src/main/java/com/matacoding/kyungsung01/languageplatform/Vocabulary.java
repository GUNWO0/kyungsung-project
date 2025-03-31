package com.matacoding.kyungsung01.languageplatform;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vocabulary")
@Getter
@Setter
public class Vocabulary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String originalText;
    private String translatedText;
    private String targetLanguage;

    public Vocabulary() {
    }

    public Vocabulary(String originalText, String translatedText, String targetLanguage) {
        this.originalText = originalText;
        this.translatedText = translatedText;
        this.targetLanguage = targetLanguage;
    }

}
