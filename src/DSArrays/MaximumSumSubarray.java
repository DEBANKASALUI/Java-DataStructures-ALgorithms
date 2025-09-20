package DSArrays;

public class MaximumSumSubarray {
    //    Using Brute-Force/Naive approach(O(n^2))
    public static void main(String[] args) {
        int arr[] = {3, 8, 2, 5, 7, 6, 12};
        int res = maximumSubArray(arr, 4);
        System.out.println("Max sum of Subarray: "+res);
    }

    public static int maximumSubArray(int arr[], int windowSize) {
        int max = 0;
        for (int i = 0; i <= arr.length - windowSize; i++) {
            int currentSum = 0;
            for (int j = i; j <= i + windowSize - 1; j++) {
                currentSum = currentSum + arr[j];
                max = Math.max(currentSum, max);
            }
        }
        return max;
    }
}
