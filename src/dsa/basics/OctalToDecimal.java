package dsa.basics;

import java.util.Scanner;

public class OctalToDecimal {

    public static int octalToDecimal(int octal) {
        int decimal = 0, base = 1; // base = 8^0 = 1
        while (octal > 0) {
            int digit = octal % 10;   // extract last digit
            decimal += digit * base;  // multiply by power of 8
            base *= 8;                // move to next power of 8
            octal /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();

        System.out.println("Decimal representation = " + octalToDecimal(octal));

        sc.close();
    }
}
