package dsa.basics;

import java.util.Scanner;

public class SumOddDigits {

    public static int sumOddDigits(int n) {
        int sum = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) sum += digit;  // add if odd
            temp /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of odd digits = " + sumOddDigits(n));

        sc.close();
    }
}
