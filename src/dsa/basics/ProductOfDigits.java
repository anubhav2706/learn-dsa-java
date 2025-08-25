package dsa.basics;

import java.util.Scanner;

public class ProductOfDigits {

    public static int productOfDigits(int n) {
        int product = 1;
        while (n > 0) {
            product *= n % 10; // multiply last digit
            n /= 10;           // remove last digit
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Product of digits = " + productOfDigits(n));

        sc.close();
    }
}
