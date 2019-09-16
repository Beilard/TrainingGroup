package ua.myCompany.lesson1.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {
    private int[] testArr;
    private int[] anotherTest;

    @Before
    public void setup() {
        testArr = new int[] {3, 5, 6, 1, 0, 4};
        anotherTest = testArr.clone();
        Arrays.sort(anotherTest);
    }


    @Test
    public void bubbleSort() {
        Sort.bubbleSort(testArr);
        assertArrayEquals(anotherTest, testArr);
    }

    @Test
    public void quickSort() {
        Sort.quickSort(testArr,0, 5);
        assertArrayEquals(anotherTest, testArr);
    }

    @Test
    public void partition() {
        Sort.partition(testArr, 0, 4);
        int[] partArr = {0, 5, 6, 1, 3, 4};
        assertArrayEquals(testArr, partArr);
    }


    @Test
    public void swap() {
        int check = testArr[0];
        Sort.swap(testArr, 0, 1);
        assertEquals(testArr[1], check);
    }
}