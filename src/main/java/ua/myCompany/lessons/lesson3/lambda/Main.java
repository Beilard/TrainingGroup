package ua.myCompany.lessons.lesson3.lambda;

public class Main {
    public static void main(String[] args) {
        AI ai = new AI() {
            @Override
            public void method() {
                System.out.println("Hello");
            }
        };
        AI ai1 = () -> {
            System.out.println("Hello");
        };

        AI ail = () -> System.out.println("Hello");

        CalcInterface calcInterface = new CalcInterface() {
            @Override
            public int calc(int arg1, int arg2) {
                return arg1 + arg2;
            }
        };

        CalcInterface calcInterface1 = (arg1, arg2) -> arg1 + arg2;

        BI bi = new BI() {
            @Override
            public int method(int a) {
                return 0;
            }
        };
        BI bi1 = a -> 0;
    }
}
