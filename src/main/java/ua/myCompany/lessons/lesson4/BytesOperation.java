package ua.myCompany.lessons.lesson4;

public class BytesOperation {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        if (a ==0 & b++ == 1) { //with && b wouldn't increase;
            System.out.println("OK");
        }

        System.out.println(a);
        System.out.println(b);


    }
}
