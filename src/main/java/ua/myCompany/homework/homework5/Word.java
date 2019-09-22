package ua.myCompany.homework.homework5;

public class Word {
    private String value;

    public Word(String word) {
        this.value = word;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        return value != null ? value.equals(word.value) : word.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
