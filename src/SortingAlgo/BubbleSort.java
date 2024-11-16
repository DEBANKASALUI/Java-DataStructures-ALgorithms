package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {

//    time O(n^2) space-O(1)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] arr = {24, 90, 1, 3, 5, 72, 12, 40};
        bubbleSort(arr);
    }
}
