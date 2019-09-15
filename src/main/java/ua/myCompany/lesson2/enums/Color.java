package ua.myCompany.lesson2.enums;

public enum Color {
    YELLOW("yellow", 1), GREEN("green");



    private String name;
    private int code;
    private Color (String name) {
        this.name = name;
    }

    Color(String name, int code) {
        this.name = name;
        this.code = code;
    }
    public void method(){
        System.out.println("1");
    }
}
