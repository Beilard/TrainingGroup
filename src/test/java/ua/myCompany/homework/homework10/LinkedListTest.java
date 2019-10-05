package ua.myCompany.homework.homework10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList<Integer> testList;

    @Before
    public void setup(){
        testList = new LinkedList<>();
    }

    @Test
    public void isEmptyHeaderTest() {
        assertTrue(testList.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void indexShouldThrowIllegalArgumentException() {
        testList.getByIndex(-1);
    }

    @Test
    public void indexIterationCheck() {
        testList.add(1);
        testList.add(2);
        testList.add(3);
        assertEquals(testList.getByIndex(1), new Integer(2));
    }

    @Test
    public void remove() {
        LinkedList<Integer> dud = new LinkedList<>();
        dud.add(1);
        testList.add(1);
        testList.add(2);
        testList.remove(2);
        assertEquals(testList, dud);
    }

    @Test
    public void cleanWithComparison() {
        LinkedList<Integer> dud = new LinkedList<>();
        testList.add(1);
        testList.clean();
        assertEquals(testList, dud);
    }
}