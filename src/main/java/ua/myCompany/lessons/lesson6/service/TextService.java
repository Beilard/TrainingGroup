package ua.myCompany.lessons.lesson6.service;

import ua.myCompany.lessons.lesson6.domain.Text;

public interface TextService {
    Text converterStringToText(String text);
    String converterTextToString(Text text);

}
