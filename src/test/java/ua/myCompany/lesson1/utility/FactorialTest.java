package ua.myCompany.lesson1.utility;

import org.junit.Test;
import ua.myCompany.lesson1.utility.Factorial.*;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testsFactorialLoop() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testsFactorialBigIntegerFirst() {
        assertEquals(24,Factorial.factorialBig(4).longValue());
    }

    @Test
    public void testsFactorialBigIntegerSecond() {
        assertEquals(720,Factorial.factorialBig(6).longValue());
    }


}