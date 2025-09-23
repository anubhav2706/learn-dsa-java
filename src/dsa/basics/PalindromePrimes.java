package dsa.basics;

import java.util.Scanner;

public class PalindromePrimes {

    // check prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // check palindrome
    public static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Palindrome primes up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
