package ua.myCompany.homework.homework1.sort;

public class Main {


    public static void main(String[] args) {
        int[] array = {3, 5, 6, 1, 0, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
        Sort.partition(array, 0, 4);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
