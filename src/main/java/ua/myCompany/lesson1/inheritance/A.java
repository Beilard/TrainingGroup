package ua.myCompany.inheritBance;

public class A {
    private static final String HIS_NAME = "Alex"; //constant



    public static int age; //static

    // static memory block
    static {
        System.out.println("Static A 1");;
    }
    static {
        System.out.println("Static A 2");
    }

    {
        System.out.println("Non-static A");
    }


}
