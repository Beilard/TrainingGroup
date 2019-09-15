package ua.myCompany.lesson1.sort;

public class Sort implements ISort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int substitute = arr[i];
                    arr[i] = arr[i + 1];
                    arr[j] = substitute;
                }
            }
        }
    }

    public void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right); //the pivot is on its place
            quickSort(array, left, pivotIndex - 1); //sort the left array
            quickSort(array, pivotIndex + 1, right); //sort the right array
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right]; // choose the rightmost element as the pivot
        int partitionIndex = left; // the first element greater than the pivot

        //move the largest value into the right side of the array
        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, right); // put the pivot in a suitable position

        return partitionIndex;
    }

    //the swap mechanism
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
