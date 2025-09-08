package dsa.basics;

import java.util.Scanner;

public class SquareRootSequenceNoLib {

    // Function to calculate square root using Newton-Raphson method
    public static double sqrt(int n) {
        double x = n;   // initial guess
        double epsilon = 1e-6;  // accuracy level

        while (Math.abs(x - n / x) > epsilon) {
            x = (x + n / x) / 2.0;
        }

        return x;
    }

    public static void printSqrtSequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("√%d ≈ %.4f%n", i, sqrt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("Square Root Sequence up to " + n + ":");
        printSqrtSequence(n);

        sc.close();
    }
}
