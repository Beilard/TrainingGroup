package ua.myCompany.lesson1.utility;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testsLoopFibonacci() {
        assertEquals(1, Fibonacci.fibonacci(1).longValue());
    }

    @Test
    public void testsFibonacciLoopSecond() {
        assertEquals(55, Fibonacci.fibonacci(10).longValue());
    }

    @Test
    public void testsFibonacciRec() {
        assertEquals(55, Fibonacci.fibonacciRec(10));
    }
}