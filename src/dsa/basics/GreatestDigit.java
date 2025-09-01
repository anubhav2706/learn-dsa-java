package dsa.basics;

import java.util.Scanner;

public class GreatestDigit {

    public static int greatestDigit(int n) {
        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit)
                maxDigit = digit;
            n /= 10;
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Greatest digit = " + greatestDigit(n));

        sc.close();
    }
}
