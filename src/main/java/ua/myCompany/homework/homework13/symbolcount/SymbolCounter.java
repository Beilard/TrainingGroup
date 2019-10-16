package ua.myCompany.homework.homework13.symbolcount;

import java.io.FileInputStream;
import java.io.IOException;

public class SymbolCounter {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("D:\\test.txt");
        byte[] array = new byte[input.available()];
        int i = input.read(array);
        System.out.println("All characters: " + i);
        String text = new String(array);
        int counter = 0;
        for (char c : text.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                counter++;
            }
        }
        System.out.println("Characters without spaces: " + counter);
    }
}
