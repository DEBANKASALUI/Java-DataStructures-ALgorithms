package SortingAlgo;

public class MergeSort {
    //    divide and conquer-time O(nlog(n) space-O(n)
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0;//left array
        int j = 0;//right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = arr[i];
            } else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;

        int i = 0;
        int l = 0;
        int r = 0;

//      check conditions for merging
        while (l < leftSize & r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {24, 90, 1, 3, 5, 72, 12, 40};
        mergeSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

