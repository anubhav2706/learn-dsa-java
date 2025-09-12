package dsa.basics.sequenceProblems;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void printAP(int a, int d, int n) {
        System.out.println("Arithmetic Progression:");
        int term = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += d;  // add common difference
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        printAP(a, d, n);

        sc.close();
    }
}
