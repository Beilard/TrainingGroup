package ua.myCompany.lessons.lesson2.enums;

import org.junit.Assert;
import org.junit.Test;

import static ua.myCompany.lessons.lesson2.enums.Calculator.calc2;

public class CalculatorTest {

    @Test
    public void shouldSumOfArguments(){
        int actual = calc2(1, "+", 1);
        int expected = 2;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldThrowExceptionForNullOperator(){


    }
}