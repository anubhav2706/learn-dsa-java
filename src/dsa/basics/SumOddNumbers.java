package dsa.basics;

import java.util.Scanner;

public class SumOddNumbers {

    public static int sumOfOdd(int n) {
        int sum = 0;
        int odd = 1;
        for (int i = 1; i <= n; i++) {
            sum += odd;
            odd += 2;  // move to next odd number
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Method 1: Using loop
        System.out.println("Sum of first " + n + " odd numbers = " + sumOfOdd(n));

        // Method 2: Using formula
        System.out.println("Using formula: " + (n * n));

        sc.close();
    }
}
