package dsa.basics;

import java.util.Scanner;

public class DigitsDivisibleBy3 {

    public static int countDivBy3(int n) {
        n = Math.abs(n); // handle negative numbers
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  // extract last digit
            if (digit % 3 == 0) {
                count++;
            }
            n /= 10; // remove last digit
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countDivBy3(num);

        System.out.println("Digits divisible by 3 in " + num + " = " + result);

        sc.close();
    }
}
