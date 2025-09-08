package dsa.basics.conversionProblems;

import java.util.Scanner;

public class BinaryToHexadecimal {

    // Step 1: Binary to Decimal
    public static int binaryToDecimal(long binary) {
        int decimal = 0, base = 1;

        while (binary > 0) {
            int lastDigit = (int)(binary % 10);
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }
        return decimal;
    }

    // Step 2: Decimal to Hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        String hex = "";
        char[] hexChars = "0123456789ABCDEF".toCharArray();

        while (decimal > 0) {
            int remainder = decimal % 16;
            hex = hexChars[remainder] + hex;
            decimal /= 16;
        }
        return hex.isEmpty() ? "0" : hex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();

        int decimal = binaryToDecimal(binary);
        String hex = decimalToHexadecimal(decimal);

        System.out.println("Hexadecimal representation = " + hex);

        sc.close();
    }
}

