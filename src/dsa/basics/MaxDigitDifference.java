package dsa.basics;

import java.util.Scanner;

public class MaxDigitDifference {

    public static int maxDifference(int n) {
        n = Math.abs(n); // handle negative numbers

        int maxDigit = 0;
        int minDigit = 9;

        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) maxDigit = digit;
            if (digit < minDigit) minDigit = digit;
            n /= 10;
        }

        return maxDigit - minDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = maxDifference(num);

        System.out.println("Maximum difference between two digits in " + num + " = " + result);

        sc.close();
    }
}
