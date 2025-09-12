package dsa.basics.sequenceProblems;

import java.util.Scanner;

public class GeometricProgression {

    public static void printGP(int a, int r, int n) {
        System.out.println("Geometric Progression:");
        int term = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= r;  // multiply by ratio
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        printGP(a, r, n);

        sc.close();
    }
}

