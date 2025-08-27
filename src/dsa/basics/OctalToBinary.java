package dsa.basics;

import java.util.Scanner;

public class OctalToBinary {

    // Step 1: Octal to Decimal
    public static int octalToDecimal(int octal) {
        int decimal = 0, base = 1;

        while (octal > 0) {
            int lastDigit = octal % 10;
            decimal += lastDigit * base;
            base *= 8;
            octal /= 10;
        }
        return decimal;
    }

    // Step 2: Decimal to Binary
    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }
        return binary.isEmpty() ? "0" : binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();

        int decimal = octalToDecimal(octal);
        String binary = decimalToBinary(decimal);

        System.out.println("Binary representation = " + binary);

        sc.close();
    }
}
