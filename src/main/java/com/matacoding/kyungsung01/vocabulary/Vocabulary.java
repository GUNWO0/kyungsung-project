package com.matacoding.kyungsung01.vocabulary;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vocabulary")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Vocabulary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String originalText;
    private String translatedText;
    private String targetLanguage;

    public Vocabulary(String originalText, String translatedText, String targetLanguage) {
        this.originalText = originalText;
        this.translatedText = translatedText;
        this.targetLanguage = targetLanguage;
    }
}
