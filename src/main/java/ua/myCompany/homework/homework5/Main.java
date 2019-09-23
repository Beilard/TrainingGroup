package ua.myCompany.homework.homework5;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Hello");
        Word word2 = new Word("friend");
        Word word3 = new Word("It's");
        Word word4 = new Word("me");
        Word word5 = new Word("again");

        System.out.println();
        Sentence sentence1 = new Sentence(word1, word2);
        System.out.println(sentence1);

        Sentence sentence2 = new Sentence(word3, word4, word5);
        System.out.println(sentence2);

        Text text1 = new Text("This is a header", sentence1, sentence2);
        text1.printText();
    }
}
