package dsa.basics.sequenceProblems;

import java.util.Scanner;

public class TribonacciSeries {

    public static void printTribonacci(int n) {
        int a = 0, b = 1, c = 1;

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");
        if (n >= 3) System.out.print(c + " ");

        for (int i = 4; i <= n; i++) {
            int d = a + b + c;  // sum of last 3 terms
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Tribonacci Series up to " + n + " terms: ");
        printTribonacci(n);

        sc.close();
    }
}
