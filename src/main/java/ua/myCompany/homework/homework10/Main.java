package ua.myCompany.homework.homework10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
//         Class<A> clazz = A.class;
//        Constructor<A> declaredConstructor = clazz.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        A a = declaredConstructor.newInstance();
//        Method method = clazz.getDeclaredMethod()

    }
}
class A {
    private A() {}
    private void method(String message) {
        System.out.println(message);
    }
}
