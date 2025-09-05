package dsa.basics;

import java.util.Scanner;

public class ProductEvenDigits {

    public static int productEvenDigits(int n) {
        int product = 1, temp = n;
        boolean hasEven = false;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                product *= digit;
                hasEven = true;
            }
            temp /= 10;
        }

        return hasEven ? product : 0;  // if no even digits, return 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Product of even digits = " + productEvenDigits(n));

        sc.close();
    }
}
