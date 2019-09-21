package ua.myCompany.homework.homework4;

import java.util.LinkedHashSet;

public class Check {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One");
        for(String s : set) {
            System.out.println(s);
        }
    }
}
