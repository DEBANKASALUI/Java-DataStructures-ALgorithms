package SearchingAlogo;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {100, 65, 23, 1, 40, 35};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be searched: ");
        int target = sc.nextInt();
        int res = linearSearch(arr, target);
        if (res != -1) System.out.println("Element found at position: " + res);
        else System.out.println("Element not present in array");
    }
}
