package dsa.basics;

import java.util.Scanner;

public class ProductOddNumbers {

    public static long productOfOdd(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= (2 * i - 1);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Product of first " + n + " odd numbers = " + productOfOdd(n));

        sc.close();
    }
}
