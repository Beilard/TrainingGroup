package ua.myCompany.lesson3.interfaces.third;

public class MyClass implements AI, BI {
    @Override
    public void method() {
        AI.super.method();
        BI.super.method();
    }
}
