package ua.myCompany.lessons.lesson5.inner.classes;

public class User {
    private static final String CODE;
    private String name;
    private String surname;
    static {
        System.out.println(Address.CODE_INNER);
        CODE = "Constant User"; // FORCES TO LOAD THE WHOLE STATIC BLOCK
        System.out.println("User");
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static class Address {
        public static final String CODE_INNER;
        private int code;
        static {
            CODE_INNER = "code inner";
            System.out.println("Address");
            System.out.println(CODE);
        }

        public void addressMethod(){
            System.out.println("Non-static address");
        }

        private static void addressStaticMethod() {
            System.out.println("Static method");
        }

        public Address(int code) {
            this.code = code;
        }
    }
}
