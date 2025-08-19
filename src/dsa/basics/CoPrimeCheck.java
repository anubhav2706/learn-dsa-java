package dsa.basics;

import java.util.Scanner;

public class CoPrimeCheck {

    // Function to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to check co-primality
    public static boolean areCoPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Check co-prime
        if (areCoPrime(a, b)) {
            System.out.println(a + " and " + b + " are Co-Prime numbers.");
        } else {
            System.out.println(a + " and " + b + " are NOT Co-Prime numbers.");
        }

        sc.close();
    }
}

