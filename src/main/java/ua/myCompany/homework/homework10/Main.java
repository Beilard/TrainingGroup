package ua.myCompany.homework.homework10;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> main = new ArrayList<>();
        main.add(10);
        main.remove(10);
        System.out.println(main.isEmpty());

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.getByIndex(0);
    }
}
