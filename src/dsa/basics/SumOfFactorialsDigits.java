package dsa.basics;

import java.util.Scanner;

public class SumOfFactorialsDigits {

    // method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;         // extract last digit
            sum += factorial(digit);       // add factorial of digit
            temp /= 10;                    // remove last digit
        }

        System.out.println("Sum of factorials of digits of " + num + " = " + sum);
        sc.close();
    }
}
