package dsa.basics;

import java.util.Scanner;

public class CircularPrime {

    // check if prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // rotate number
    public static int rotateNumber(int n, int digits) {
        int pow = (int) Math.pow(10, digits - 1);
        int lastDigit = n % 10;
        return (lastDigit * pow) + (n / 10);
    }

    // check circular prime
    public static boolean isCircularPrime(int n) {
        if (!isPrime(n)) return false;

        int digits = countDigits(n);
        int temp = n;

        for (int i = 1; i < digits; i++) {
            temp = rotateNumber(temp, digits);
            if (!isPrime(temp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isCircularPrime(num))
            System.out.println(num + " → Circular Prime (all rotations are prime)");
        else
            System.out.println(num + " → Not a Circular Prime");

        sc.close();
    }
}
