package dsa.basics;

import java.util.Scanner;

public class SumOfSquaresDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;       // extract digit
            sum += digit * digit;       // add square
            temp /= 10;                 // remove last digit
        }

        System.out.println("Sum of squares of digits of " + num + " = " + sum);
        sc.close();
    }
}

