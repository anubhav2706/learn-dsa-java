package dsa.basics;

import java.util.Scanner;

public class PowerOfNumber {

    // Function to calculate power
    public static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int a = sc.nextInt();

        System.out.print("Enter exponent: ");
        int b = sc.nextInt();

        System.out.println(a + "^" + b + " = " + power(a, b));

        sc.close();
    }
}
