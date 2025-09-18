package dsa.basics;

import java.util.Scanner;

public class TwistedPrime {

    // check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    // check twisted prime
    public static boolean isTwistedPrime(int n) {
        if (!isPrime(n)) return false;
        int rev = reverse(n);
        return isPrime(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isTwistedPrime(num))
            System.out.println(num + " → Twisted Prime (both " + num + " and " + reverse(num) + " are prime)");
        else
            System.out.println(num + " → Not a Twisted Prime");

        sc.close();
    }
}
