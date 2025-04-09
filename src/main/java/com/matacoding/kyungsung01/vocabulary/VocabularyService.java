package com.matacoding.kyungsung01.vocabulary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VocabularyService {

    private final VocabularyRepository vocabularyRepository;

    public void save(VocabularyRequest request) {
        Vocabulary vocab = new Vocabulary(
                request.getOriginalText(),
                request.getTranslatedText(),
                request.getTargetLanguage()
        );
        vocabularyRepository.save(vocab);
    }

    public List<VocabularyResponse> getAllVocabulary() {
        return vocabularyRepository.findAll()
                .stream()
                .map(VocabularyResponse::new)
                .collect(Collectors.toList());
    }
}
