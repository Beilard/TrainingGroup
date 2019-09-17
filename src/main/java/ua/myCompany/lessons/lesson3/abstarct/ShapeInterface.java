package ua.myCompany.lessons.lesson3.abstarct;

public interface ShapeInterface {
    public static final String NAME = "";

    public abstract int getPerimeter();

    default void method(String name){
        System.out.println(name);
    }

    public static int calc(){
        return 0;
    }
}
