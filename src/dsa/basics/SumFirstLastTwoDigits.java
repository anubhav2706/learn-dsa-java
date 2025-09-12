package dsa.basics;

import java.util.Scanner;

public class SumFirstLastTwoDigits {

    // Function to get first two digits
    public static int firstTwoDigits(int n) {
        while (n >= 100) { // reduce until only first two digits remain
            n /= 10;
        }
        return n;
    }

    // Function to get last two digits
    public static int lastTwoDigits(int n) {
        return n % 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (at least 2 digits): ");
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("Number must have at least 2 digits.");
        } else {
            int firstTwo = firstTwoDigits(n);
            int lastTwo = lastTwoDigits(n);

            System.out.println("First two digits = " + firstTwo);
            System.out.println("Last two digits = " + lastTwo);
            System.out.println("Sum = " + (firstTwo + lastTwo));
        }

        sc.close();
    }
}
