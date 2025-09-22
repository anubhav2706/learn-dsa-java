package dsa.basics.specialNumbers;

import java.util.Scanner;

public class SmithNumber {

    // Function to calculate sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to check Smith number
    public static boolean isSmith(int n) {
        if (isPrime(n)) return false; // Prime numbers are not Smith

        int originalSum = sumOfDigits(n);
        int temp = n;
        int factorsSum = 0;

        // Factorize and sum digits of prime factors
        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                factorsSum += sumOfDigits(i);
                temp /= i;
            }
        }

        return originalSum == factorsSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSmith(num))
            System.out.println(num + " → Smith Number");
        else
            System.out.println(num + " → Not a Smith Number");

        sc.close();
    }
}
