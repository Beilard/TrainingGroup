package ua.myCompany.lessons.lesson11.example.com.univer.validator;

public interface Validator<T> {
    void validate(T item); //throws exception, no need for boolean
}
