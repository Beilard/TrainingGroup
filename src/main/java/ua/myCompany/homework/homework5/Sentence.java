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
}
