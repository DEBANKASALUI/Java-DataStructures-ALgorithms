package DSArrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = {3, 8, 2, 5, 7, 6, 12};
        int res = slidingWindow(arr, 4);
        System.out.println("Max sum of Subarray of given Window size: "+res);
    }

    public static int slidingWindow(int[] arr, int windowSize) {
        int currentSum = 0;
        for (int i = 0; i < windowSize; i++) {
            currentSum = currentSum + arr[i];
        }
        int max = currentSum;
        for (int i = 1; i <= arr.length - windowSize; i++) {
            currentSum = currentSum - arr[i - 1] + arr[i + windowSize - 1];
            if (currentSum > max)
                max = currentSum;
        }
        return max;
    }
}
