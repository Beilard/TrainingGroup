package ua.myCompany.lessons.lesson4;

public class Main {

    public static void main(String[] args) {
     float f = 29.1f;
     double d = 29.1;
        System.out.println(f==d);
    f = 29.1f;
    d = 29.1f;
        System.out.println(f==d);

    }
}

class Parent {
    static {
        System.out.println("Static init block parent");
    }

    {
        System.out.println("Non-static init block parent 1");
    }

    {
        System.out.println("Non-static init block parent 2");
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent{
    static {
        System.out.println("Static init block child");
    }

    {
        System.out.println("Non-static init block child 1");
    }

    {
        System.out.println("Non-static init block child 2");
    }

    Child() {
        System.out.println("Child constructor");
    }
}

