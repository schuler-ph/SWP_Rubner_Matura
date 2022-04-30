package Sorting;

import java.util.Arrays;

class SelectionSort {
    // inplace, not stable, iterativ
    // best case    O(n^2)
    // avg case     O(n^2)
    // worst case   O(n^2)

    // Vorteil: gut bei kleinen Listen
    // Nachteil: nicht stabil (kann durch swaps, die nur maximal 1 groß sind, stabil gemacht werden)

    static void sort(int arr[]){
        int size = arr.length;

        for(int step = 0; step < size - 1; step++){
            int min_index = step;
            for(int i = step + 1; i < size; i++)
                if(arr[i] < arr[min_index]) min_index = i;

            int temp = arr[min_index];
            arr[min_index] = arr[step];
            arr[step] = temp;
        }
    }

    public static void main(String args[]) {
        int[] data = { 20, 12, 10, 15, 2 };
        SelectionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}