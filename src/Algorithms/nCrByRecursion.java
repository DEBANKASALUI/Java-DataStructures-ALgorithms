package Algorithms;


public class nCrByRecursion {

    //    nCr=(n-1)C(r-1)+(n-1)Cr
    static int fact(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fact(n - 1);
    }

    static int nCrRecursive(int n, int r) {
        if (r == 0 || r == n) return 1;
        return nCrRecursive(n - 1, r - 1) + nCrRecursive(n - 1, r);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + nCrRecursive(4, 3));
    }
}
