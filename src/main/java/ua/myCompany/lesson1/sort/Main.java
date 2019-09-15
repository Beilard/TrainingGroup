package ua.myCompany.lesson1.sort;

public class Main {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr = {1,9,2,9,5,6,8};
        sort.sort(arr);
        for (int n: arr) {
            System.out.println(arr[n]);
        }
    }
}
