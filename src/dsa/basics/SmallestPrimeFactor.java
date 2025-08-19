package dsa.basics;

import java.util.Scanner;

public class SmallestPrimeFactor {

    public static int smallestPrimeFactor(int n) {
        if (n <= 1) return -1; // no prime factors

        if (n % 2 == 0) return 2; // even number → smallest factor is 2

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return i; // first divisor found → smallest prime factor
            }
        }

        return n; // if no divisor, number itself is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int spf = smallestPrimeFactor(n);
        if (spf == -1) {
            System.out.println("No prime factors for numbers <= 1");
        } else {
            System.out.println("Smallest prime factor of " + n + " is: " + spf);
        }

        sc.close();
    }
}

