package DSArrays;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 30, 40, 50, 70, 85, 90};
        int[] result = twoPointerTechnique(arr, 70);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoPointerTechnique(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
//                For return elements of array
                return new int[]{arr[left], arr[right]};
//                For return indices of element of Array
//                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{0, 0};
    }
}
