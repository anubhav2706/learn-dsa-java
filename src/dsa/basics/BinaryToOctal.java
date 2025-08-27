package dsa.basics;

import java.util.Scanner;

public class BinaryToOctal {

    // Step 1: Binary to Decimal
    public static int binaryToDecimal(int binary) {
        int decimal = 0, base = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }
        return decimal;
    }

    // Step 2: Decimal to Octal
    public static String decimalToOctal(int decimal) {
        String octal = "";
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal /= 8;
        }
        return octal.isEmpty() ? "0" : octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = binaryToDecimal(binary);
        String octal = decimalToOctal(decimal);

        System.out.println("Octal representation = " + octal);

        sc.close();
    }
}
