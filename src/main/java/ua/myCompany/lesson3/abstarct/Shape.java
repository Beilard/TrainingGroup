package ua.myCompany.lesson3.abstarct;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract int getPerimeter();
}