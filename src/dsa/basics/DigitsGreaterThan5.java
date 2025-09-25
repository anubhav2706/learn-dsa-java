package dsa.basics;

import java.util.Scanner;

public class DigitsGreaterThan5 {

    public static int countGreaterThan5(int n) {
        n = Math.abs(n); // handle negatives
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  // extract last digit
            if (digit > 5) {
                count++;
            }
            n /= 10;  // remove last digit
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countGreaterThan5(num);

        System.out.println("Digits greater than 5 in " + num + " = " + result);

        sc.close();
    }
}
