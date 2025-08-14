package dsa.basics;
import java.util.*;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;  // 0,1,-ve numbers are not prime
        if (n == 2) return true;   // 2 is prime
        if (n % 2 == 0) return false; // even numbers > 2 are not prime

        // check only odd divisors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}