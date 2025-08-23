package dsa.basics;

import java.util.Scanner;

public class SumEvenNumbers {

    // Method 1: Loop (adds 2, 4, 6, ... up to n terms)
    public static long sumOfFirstNEvensLoop(int n) {
        long sum = 0;
        int even = 2;
        for (int i = 1; i <= n; i++) {
            sum += even;
            even += 2;
        }
        return sum;
    }

    // Method 2: Formula n * (n + 1)
    public static long sumOfFirstNEvensFormula(int n) {
        return (long) n * (n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " even numbers (loop)    = " + sumOfFirstNEvensLoop(n));
        System.out.println("Sum of first " + n + " even numbers (formula) = " + sumOfFirstNEvensFormula(n));

        sc.close();
    }
}

