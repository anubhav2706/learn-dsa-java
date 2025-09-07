package dsa.basics;

import java.util.Scanner;

public class ProductSumDifference {

    public static int difference(int n) {
        int sum = 0, product = 1, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Difference (Product - Sum) of digits = " + difference(n));

        sc.close();
    }
}

