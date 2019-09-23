package ua.myCompany.homework.homework5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextTest {
    Word word1 = new Word("hello");
    Word word2 = new Word("world");

    Sentence sentence1;
    Sentence sentence2;
    Sentence sentence3;
    Text text1;

    @Before
    public void setUp(){
        sentence1 = new Sentence(word1);
        sentence2 = new Sentence(word1, word2);
        sentence3 = new Sentence(word2);


        text1 = new Text(sentence2);
    }

    @Test
    public void append_word_shouldHaveNormalBehaviour() {
        Text testText = new Text(sentence1);
        testText.append(word2);
        assertEquals(testText.toString(), "\tNo header\nhello. world ");
    }

    @Test
    public void append_sentence_shouldHaveNormalBehaviour() {
        Text testText = new Text(sentence1);
        testText.append(sentence3);
        assertEquals(testText.toString(), "\tNo header\nhello. world. ");
    }

    @Test
    public void printText() {
    }
}