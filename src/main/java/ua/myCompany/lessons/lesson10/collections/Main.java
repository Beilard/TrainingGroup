package ua.myCompany.lessons.lesson10.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2);
        Iterator<Integer> iterator = list.iterator();
        Integer next = iterator.next();
        Integer next1 = iterator.next();
        Integer next2 = iterator.next();
        System.out.println(next);
        System.out.println(next1);
        System.out.println(next2);
    }

}
