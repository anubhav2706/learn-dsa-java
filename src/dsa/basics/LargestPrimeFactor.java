package dsa.basics;

import java.util.Scanner;

public class LargestPrimeFactor {

    public static int largestPrimeFactor(int n) {
        if (n <= 1) return -1; // no prime factors

        int largest = -1;

        // Remove factors of 2
        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }

        // Check odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }

        // If n is still > 2, then it is prime itself
        if (n > 2) {
            largest = n;
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int lpf = largestPrimeFactor(n);
        if (lpf == -1) {
            System.out.println("No prime factors for numbers <= 1");
        } else {
            System.out.println("Largest prime factor of " + n + " is: " + lpf);
        }

        sc.close();
    }
}

