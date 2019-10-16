package ua.myCompany.homework.homework13.symbolcount;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class MapSymbolCounter {
    public static Map<Character, Integer> getFileStatistics(String fileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Stream<String> lines = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8);
            lines.forEach(stringBuilder::append);
        } catch (IOException e) {
            throw new IOException("Wrong input");
        }
        String text = stringBuilder.toString();
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int count = result.get(ch) != null ? result.get(ch) : 0;
            count++;
            result.put(ch, count);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = getFileStatistics("D:\\test.txt");
        for (Iterator<Character> it = map.keySet().iterator(); it.hasNext(); ) {
            Character key = it.next();
            System.out.println(key + " = " + map.get(key));
        }
    }
}

