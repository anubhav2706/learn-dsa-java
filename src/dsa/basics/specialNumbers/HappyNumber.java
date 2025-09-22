package dsa.basics.specialNumbers;

import java.util.Scanner;

public class HappyNumber {

    // Function to compute sum of squares of digits
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // Function to check if a number is Happy
    public static boolean isHappy(int n) {
        int slow = n, fast = n;
        
        // Use Floyd’s Cycle detection (tortoise and hare)
        do {
            slow = sumOfSquares(slow);                  // move 1 step
            fast = sumOfSquares(sumOfSquares(fast));    // move 2 steps
        } while (slow != fast);

        return slow == 1;  // if we reach 1 → Happy Number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n))
            System.out.println(n + " → Happy Number");
        else
            System.out.println(n + " → Not a Happy Number");

        sc.close();
    }
}
