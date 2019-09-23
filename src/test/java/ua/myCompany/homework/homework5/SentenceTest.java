package ua.myCompany.homework.homework5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceTest {
    Word word1 = new Word("hello");
    Word word2 = new Word("world");

    Sentence sentence1;

    @Before
    public void setUp(){
        sentence1 = new Sentence(word1);
    }


    @Test
    public void append_word_shouldHaveNormalBehaviour() {
        Sentence testSentence = new Sentence(new Word("hello"), new Word("world"));
        sentence1.append(word2);
        assertEquals(sentence1.toString(), testSentence.toString());
    }
}