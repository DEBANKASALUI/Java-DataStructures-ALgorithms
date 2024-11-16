package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void main(String[] args) {
        int[] arr = {24, 90, 1, 3, 5, 72, 12, 40};
        insertionSort(arr);
    }
}

