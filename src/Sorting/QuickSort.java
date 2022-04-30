package Sorting;

import java.util.Arrays;

class QuickSort {
    // inplace, not stable, rekursiv
    // best case    O(n*log(n))
    // avg case     O(n*log(n))
    // worst case   O(n^2)

    // Vorteil: n*log(n) avg + inplace, gut bei Arrays
    // Nachteil: kann zu n^2 mutieren, wenn jedes mal sehr schlechtes Pivot-Element gewählt wird

    static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    static void sort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            sort(array, low, pi - 1);

            // recursive call on the right of pivot
            sort(array, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        QuickSort.sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}