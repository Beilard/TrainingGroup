package ua.myCompany.lessons.lesson3.singleton;

public class Singleton1 {
    private static final Singleton1 SINGLETON_1 = new Singleton1();

    private Singleton1(){
    }

    public void method() {
        System.out.println("Hello");
    }
}
