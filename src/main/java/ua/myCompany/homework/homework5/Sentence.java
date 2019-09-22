package ua.myCompany.homework.homework5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence {
    private StringBuilder sb = new StringBuilder("");

    public Sentence(Word... word) {
        for (Word w : word) {
            sb.append(w).append(" ");
        }
    }

    void append(Word additionalWord) {
        sb.append(additionalWord).append(" ");
    }

    @Override
    public String toString() {
        return sb.replace(sb.length()-1,sb.length(), ".").toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;

        return sb != null ? sb.equals(sentence.sb) : sentence.sb == null;
    }

    @Override
    public int hashCode() {
        return sb != null ? sb.hashCode() : 0;
    }
}
