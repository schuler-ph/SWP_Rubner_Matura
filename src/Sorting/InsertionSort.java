package Sorting;

import java.util.Arrays;

class InsertionSort {
    // inplace, stable, iterativ
    // best case    O(n)
    // avg case     O(n^2)
    // worst case   O(n^2)

    // Vorteil: Online
    // Nachteil: Langsam bei großen Datenmengen

    static void sort(int arr[]) {
        int size = arr.length;

        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        InsertionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}