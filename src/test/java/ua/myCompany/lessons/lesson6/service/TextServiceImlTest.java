package ua.myCompany.lessons.lesson6.service;

import org.junit.Test;
import ua.myCompany.lessons.lesson6.domain.Letter;
import ua.myCompany.lessons.lesson6.domain.Sentence;
import ua.myCompany.lessons.lesson6.domain.Text;
import ua.myCompany.lessons.lesson6.domain.Word;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TextServiceImlTest {
    private final TextServiceIml textServiceIml = new TextServiceIml(); //or interface link
    @Test
    public void converterStringToText_shouldReturnNullForNullText() {

    }

    @Test
    public void converterTextToString_shouldReturnNullForNullText() {
        String expectedResult = null;
        String actualResult = textServiceIml.converterTextToString(null);
//        assertEquals(expectedResult, actualResult); //or assertNull
        assertNull(actualResult);
    }

    @Test
    public void convertTextToString_shouldReturnTextForText() {
        String expectedResult = "Hello world!";
//        Text text = new Text(new Sentence(Arrays.asList(new Word(Arrays.asList(new Letter('a'))))));
//        String actualResult = textServiceIml.converterTextToString(Arrays.asList());
//        assertEquals(expectedResult, actualResult);
    }
}