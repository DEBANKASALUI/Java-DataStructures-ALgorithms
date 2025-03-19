package SearchingAlogo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                left = mid + 1;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {100, 65, 23, 1, 40, 35};
        Arrays.sort(arr);
        System.out.println("Sorting Array for Binary Search: " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to be searched: ");
        int target = sc.nextInt();
        int res = binarySearch(arr, target);
        if (res != -1) System.out.println("Element found at position: " + res);
        else System.out.println("Element not present in array");
    }
}
