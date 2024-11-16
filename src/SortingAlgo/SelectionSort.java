package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void main(String[] args) {
        int[] arr = {24, 90, 1, 3, 5, 72, 12, 40};
        selectionSort(arr);
    }
}

