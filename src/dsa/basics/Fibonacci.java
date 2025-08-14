package dsa.basics;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        // Handle edge cases
        if (n <= 0) {
            System.out.println("Sum = 0");
            return;
        }

        int a = 0, b = 1, sum = a + b;

        // If n == 1, only count first Fibonacci (0)
        if (n == 1) {
            System.out.println("Sum = " + a);
            return;
        }

        // If n == 2, count 0 + 1
        if (n == 2) {
            System.out.println("Sum = " + sum);
            return;
        }

        // Generate and sum Fibonacci numbers up to n terms
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers = " + sum);
    }
}