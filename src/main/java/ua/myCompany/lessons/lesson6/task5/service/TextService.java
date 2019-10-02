package ua.myCompany.lessons.lesson6.task5.service;

import ua.myCompany.lessons.lesson6.task5.domain.Text;

public interface TextService {
    Text converterStringToText(String text);
    String converterTextToString(Text text);

}
