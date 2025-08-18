package dsa.basics;

import java.util.Scanner;

public class FactorsOfNumber {

    // Function to print factors of n
    public static void printFactors(int n) {
        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Print factors
        printFactors(n);

        sc.close();
    }
}
