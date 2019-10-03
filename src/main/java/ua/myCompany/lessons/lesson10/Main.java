package ua.myCompany.lessons.lesson10;

public class Main {
    private static String msg(String msg) {
        System.out.println(msg);
        return msg;
    }

    public Main() {
        m = msg("1");
    }

    { m = msg ("2");}
    String m = msg("3");

    public static void main(String[] args) {
        Object obj = new Main();
    }
}
