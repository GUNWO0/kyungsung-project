package com.matacoding.kyungsung01.vocabulary;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/vocabulary")
public class VocabularyController {

    private final VocabularyService vocabularyService;

    @GetMapping
    public String getVocabularyList(Model model) {
        model.addAttribute("vocabularies", vocabularyService.getAllVocabulary());
        return "vocabulary/list";
    }

    @PostMapping
    public String saveVocabulary(@ModelAttribute VocabularyRequest request) {
        vocabularyService.save(request);
        return "redirect:/vocabulary";
    }
}
