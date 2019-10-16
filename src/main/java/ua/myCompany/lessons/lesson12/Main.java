package ua.myCompany.lessons.lesson12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<A> items = new TreeSet<>();
        A a = new A(1);
        items.add(a);
        System.out.println(items.size());
        A a1 = new A(1);
        items.add(a1);
        boolean isContained = items.contains(a);
        a.setCode(100);
        System.out.println(isContained);

        Comparator<A> comparator = ((o1, o2) -> o1.getCode() + o2.getCode());
        TreeSet<A> as = new TreeSet<>(comparator);
        as.add(a);

        TreeSet<B> bs = new TreeSet<>(Comparator.comparingInt(B::getCode));
        Comparator<B> comparatorB = new Comparator<B>() {
            @Override
            public int compare(B o1, B o2) {
                if (o1 == null || o2 == null) {
                    return 1;
                }
                return o1.getCode() - o2.getCode();
            }
        };
        bs.add(null);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        int[] array = new int[0];
        System.out.println(array[0]);

    }
}
