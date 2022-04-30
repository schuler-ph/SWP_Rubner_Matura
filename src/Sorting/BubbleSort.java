package Sorting;

import java.util.Arrays;

class BubbleSort {
    // inplace, stable, iterativ
    // best case    O(n)
    // avg case     O(n^2)
    // worst case   O(n^2)

    // Vorteil: einfach zu erklären
    // Nachteil: langsam

    static void sort(int arr[]){
        int size = arr.length;

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] data = { 17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0 };
        BubbleSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}