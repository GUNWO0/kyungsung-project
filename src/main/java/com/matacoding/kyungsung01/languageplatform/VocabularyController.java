package com.matacoding.kyungsung01.languageplatform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VocabularyController {

    @Autowired
    private VocabularyRepository vocabularyRepository;

    @PostMapping("/add")
    public Vocabulary addVocabulary(@RequestBody Vocabulary vocabulary) {
        return vocabularyRepository.save(vocabulary);
    }

    @GetMapping("/list")
    public List<Vocabulary> getAllVocabulary() {
        return vocabularyRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVocabulary(@PathVariable Long id) {
        vocabularyRepository.deleteById(id);
    }
}
