package dsa.basics;

import java.util.Scanner;

public class MultiplesUpToN {

    public static void printMultiples(int num, int n) {
        System.out.println("Multiples of " + num + " up to " + n + " are:");
        for (int i = 1; i * num <= n; i++) {
            System.out.print((i * num) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Input limit
        System.out.print("Enter the limit (n): ");
        int n = sc.nextInt();

        // Print multiples
        printMultiples(num, n);

        sc.close();
    }
}

