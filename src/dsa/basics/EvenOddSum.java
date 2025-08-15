package dsa.basics;
import java.util.Scanner;

public class EvenOddSum {

    public static void calculateSums(int n) {
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) 
                evenSum += i;
            else 
                oddSum += i;
        }
        System.out.println("Sum of even numbers from 1 to " + n + " = " + evenSum);
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + oddSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number up to which you want to calculate sums: ");
        int n = sc.nextInt();

        // Calculate and print sums
        calculateSums(n);

        sc.close();
    }
}
