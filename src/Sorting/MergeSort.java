package Sorting;

import java.util.Arrays;

class MergeSort {
    // not inplace, stable, rekursiv
    // best case    O(n*log(n)) => weil man den Array immer in 2 hälften teilt (log(n)) und anschließend jedes Element mergen muss (n)
    // avg case     O(n*log(n))
    // worst case   O(n*log(n))

    // Vorteil: gut bei LinkedList und großen Datenmengen
    // Nachteil: not inplace

    static void merge(int arr[], int p, int q, int r) {

        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int l, int r) {
        if (l < r) {

            // m is the point where the array is divided into two subarrays
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted subarrays
            merge(arr, l, m, r);
        }
    }

    public static void main(String args[]) {
        int[] data = { 6, 5, 12, 10, 9, 1 };
        MergeSort.sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}