package dsa.basics;

import java.util.Scanner;

public class ProductOddDigits {

    public static int productOddDigits(int n) {
        int product = 1, temp = n;
        boolean hasOdd = false;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                product *= digit;
                hasOdd = true;
            }
            temp /= 10;
        }

        return hasOdd ? product : 0;  // if no odd digits, return 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Product of odd digits = " + productOddDigits(n));

        sc.close();
    }
}
