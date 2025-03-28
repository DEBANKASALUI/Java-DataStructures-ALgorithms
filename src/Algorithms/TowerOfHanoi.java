package Algorithms;

public class TowerOfHanoi {

//    Algorithm:  1. n-1 from Source to Helper using Destination
//                2. nth from Source to Destination
//                3. n-1 Helper to Destination using Source

    static void TOH(int n, char source, char helper, char destination) {
//        base case
        if (n == 1) {
            System.out.println("Move Disc 1 from " + source + " to " + destination);
            return;
        }
        TOH(n - 1, source, destination, helper);
        System.out.println("Move Disc " + n + " from " + source + " to " + destination);
        TOH(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        TOH(n, 'A', 'B', 'C');
    }
}
