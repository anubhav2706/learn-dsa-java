package dsa.basics;
import java.util.Scanner;

public class NthPrime {

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

    // Function to find the nth prime
    public static int nthPrime(int n) {
        int count = 0, candidate = 1;

        while (count < n) {
            candidate++;
            if (isPrime(candidate)) {
                count++;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to find the n-th prime number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter n >= 1.");
        } else {
            int result = nthPrime(n);
            System.out.println("The " + n + getSuffix(n) + " prime number is: " + result);
        }

        sc.close();
    }

    // Helper for suffix (st, nd, rd, th)
    private static String getSuffix(int n) {
        int v = n % 100;
        if (v >= 11 && v <= 13) return "th";
        switch (n % 10) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}
