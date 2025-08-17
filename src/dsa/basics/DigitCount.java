package dsa.basics;

import java.util.Scanner;

public class DigitCount {

    public static void countDigits(int n, int d) {
        int count = 0, occurrence = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == d) occurrence++;
            count++;
            temp /= 10;
        }
        System.out.println("The number " + n + " has " + count + " digits.");
        System.out.println("Digit " + d + " occurs " + occurrence + " times.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter the digit to count its occurrence: ");
        int d = sc.nextInt();

        // Call method
        countDigits(n, d);

        sc.close();
    }
}
