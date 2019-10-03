package ua.myCompany.lessons.lesson10.example4;

public class Main {
    public static void main(String[] args) {

        Container<Integer> container = new Container<>(1, 2, 3);
        Container<Double> containerD = new Container<>(1D, 2D, 3D);

        System.out.println(containerD.isEqual(container));
    }
}
