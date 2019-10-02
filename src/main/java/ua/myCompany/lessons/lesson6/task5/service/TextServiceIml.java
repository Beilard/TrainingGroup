package ua.myCompany.lessons.lesson6.task5.service;

import ua.myCompany.lessons.lesson6.task5.domain.Text;

import java.util.Objects;

public class TextServiceIml implements TextService {
    @Override
    public Text converterStringToText(String text) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public String converterTextToString(Text text) {
        return Objects.isNull(text) ? null : text.toString();
    }


}
