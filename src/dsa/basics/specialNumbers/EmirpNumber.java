package dsa.basics.specialNumbers;

import java.util.Scanner;

public class EmirpNumber {

    // check if prime
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

    // check emirp
    public static boolean isEmirp(int n) {
        if (!isPrime(n)) return false;
        int rev = reverse(n);
        return (rev != n && isPrime(rev));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEmirp(num))
            System.out.println(num + " → ✅ Emirp (prime & reverse " + reverse(num) + " is also prime)");
        else
            System.out.println(num + " → ❌ Not Emirp");

        sc.close();
    }
}
