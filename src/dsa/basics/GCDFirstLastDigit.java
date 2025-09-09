package dsa.basics;

import java.util.Scanner;

public class GCDFirstLastDigit {

    // Function to compute GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find first digit
    public static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    // Function to find last digit
    public static int lastDigit(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int first = firstDigit(n);
        int last = lastDigit(n);

        System.out.println("First digit = " + first + ", Last digit = " + last);
        System.out.println("GCD = " + gcd(first, last));

        sc.close();
    }
}
