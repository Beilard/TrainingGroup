package ua.myCompany.homework.homework5;

/* 1. Создать приложение, удовлетворяющее требованиям, приведенным в зада-
нии. Наследование применять только в тех заданиях, в которых это логически
обосновано. Аргументировать принадлежность классу каждого создаваемого
метода и корректно переопределить для каждого класса методы equals(),
hashCode(), toString().
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

import java.util.ArrayList;

public class Text {
    private String header;
    private StringBuilder sb = new StringBuilder();

    public Text(Sentence... sentences) {
        header = "No header";
        for (Sentence s : sentences) {
            sb.append(s).append(" ");
        }
    }

    public Text(String header, Sentence... sentences) {
        this.header = header;
        for (Sentence s : sentences) {
            sb.append(s).append(" ");
        }
    }

    @Override
    public String toString() {
        return "\t" + header + "\n" + sb.toString();
    }
}
