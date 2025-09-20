package DSArrays;

public class SecondHighestElementArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 55, 30, 40, 50, 60};
        findSecondHighestElementArray(arr);
    }

    public static void findSecondHighestElementArray(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        arr[0] = max1;
        arr[1] = max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Second Highest element:" + max2);
    }
}
