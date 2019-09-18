package ua.myCompany.homework.homework1.sort;

public class Sort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                //swaps adjacent elements
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right); //the pivot is on its place
            quickSort(array, left, pivotIndex - 1); //sort the left array
            quickSort(array, pivotIndex + 1, right); //sort the right array
        }
    }

    public static int partition(int[] array, int left, int right) {
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
