package ua.myCompany.lessons.lesson12.example2;

import java.util.*;

import static java.util.Collections.*;
import static java.util.Objects.isNull;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<String> thisWords = isNull(words) ? emptyList() : unmodifiableList(words);
        Collections.singletonList("One");

        List<String> string = Arrays.asList("One", "Two");

        //idToUsers
        Map<Character, Integer> emailToPassword = new HashMap<>();
//        emailToPassword.put("Key1", "Value1");
//        emailToPassword.put("Key2,", "Value2'");

        Set<Map.Entry<Character, Integer>> entries = emailToPassword.entrySet();
        Set<Character> strings = emailToPassword.keySet();
        Collection<Integer> values = emailToPassword.values();
        emailToPassword.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

    }

    public static Map<Character, Integer> method(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Nhe argument is null");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char [] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                Integer counter = map.get(chars[i]);
                map.put(chars[i], ++counter);
            }
            map.put(chars[i], 1);
        }
        return map;
    }

    public static Map<Character, Integer> methodMerge(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Nhe argument is null");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char [] chars = sentence.toCharArray();
        for (char ch : chars) {
            map.merge(ch, 1, (a,b) -> ++a );
        }
        return map;
    }
}
