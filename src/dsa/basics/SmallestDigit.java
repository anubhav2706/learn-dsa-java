package dsa.basics;

import java.util.Scanner;

public class SmallestDigit {

    public static int smallestDigit(int n) {
        int minDigit = 9;  // maximum possible digit
        while (n > 0) {
            int digit = n % 10;
            if (digit < minDigit)
                minDigit = digit;
            n /= 10;
        }
        return minDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Smallest digit = " + smallestDigit(n));

        sc.close();
    }
}
