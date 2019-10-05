package ua.myCompany.homework.homework10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList<Integer> testList;

    @Before
    public void setup() {
        testList = new ArrayList<>();
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_shouldThrowAnIllegalArgumentException() {
        ArrayList<Integer> testList = new ArrayList<>(-1);
    }

    @Test
    public void getByIndexComparisonTest() {
        testList.add(5);
        testList.add(4);
        testList.add(3);
        assertEquals(testList.getByIndex(2), new Integer(3));
    }

    @Test
    public void removeUsualBehaviour() {
        testList = new ArrayList<>(2);
        ArrayList<Integer> dud = new ArrayList<>(2);
        dud.add(2);
        testList.add(1);
        testList.add(2);
        testList.remove(1);
        assertEquals(testList, dud);
    }

    @Test
    public void cleanComparisonToANewArray() {
        ArrayList<Integer> empty = new ArrayList<>();
        testList.add(10);
        testList.clean();
        assertEquals(testList, empty);

    }
}