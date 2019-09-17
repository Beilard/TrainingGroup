package ua.myCompany.lesson3.anonimous;

public class Main {
    public static void main(String[] args) {
        AI ai = new AI() {
            @Override
            public int method() {
                return 0;
            }

            @Override
            public void Hello() {
                System.out.println("Hi");
            }
        };
        ai.Hello();

        MyClass myClass = new MyClass(100){
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        System.out.println(myClass.getClass().getName());


    }
}
