package dsa.basics;

import java.util.Scanner;

public class PrimeUptoN {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to print primes up to n
    public static void printPrimes(int n) {
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Print primes
        printPrimes(n);

        sc.close();
    }
}

