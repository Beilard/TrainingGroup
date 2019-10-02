package ua.myCompany.lessons.lesson6.task5.domain;

import java.util.List;

public class Sentence {
    private final List<Word> words;

    public List<Word> getWords() {
        return words;
    }

    public Sentence(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }
}
