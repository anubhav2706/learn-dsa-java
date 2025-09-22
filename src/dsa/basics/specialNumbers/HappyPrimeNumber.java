package dsa.basics.specialNumbers;

import java.util.Scanner;

public class HappyPrimeNumber {

    // check prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // check happy number
    public static boolean isHappy(int n) {
        int slow = n, fast = n;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    // helper: sum of squares of digits
    public static int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // check happy prime
    public static boolean isHappyPrime(int n) {
        return isPrime(n) && isHappy(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHappyPrime(num))
            System.out.println(num + " → Happy Prime Number");
        else
            System.out.println(num + " → Not a Happy Prime Number");

        sc.close();
    }
}
