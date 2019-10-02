package ua.myCompany.lessons.lesson9.example1;

import ua.myCompany.lessons.lesson9.example1.exception.ExceptionA;

public class ClassB extends ClassA {
    @Override
    public Object method(Object object) throws ExceptionA {
        super.method(object);
        return null;
    }
}
