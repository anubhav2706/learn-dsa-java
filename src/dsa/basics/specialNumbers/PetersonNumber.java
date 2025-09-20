package dsa.basics.specialNumbers;

import java.util.Scanner;

public class PetersonNumber {

    // Function to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check Peterson Number
    public static boolean isPeterson(int n) {
        int temp = n, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPeterson(n))
            System.out.println(n + " → Peterson Number");
        else
            System.out.println(n + " → Not a Peterson Number");

        sc.close();
    }
}
