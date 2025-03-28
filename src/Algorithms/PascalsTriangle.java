package Algorithms;


import java.util.Scanner;

public class PascalsTriangle {
    // Function to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Function to calculate nCr
    static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++){
            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }

            // Print values in the row
            for (int j = 0; j <= i; j++){
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println(); // Move to the next line
        }
        scanner.close();
    }
}
