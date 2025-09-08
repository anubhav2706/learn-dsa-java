package dsa.basics.conversionProblems;

import java.util.Scanner;

public class BinaryToDecimal {

    public static int binaryToDecimal(int binary) {
        int decimal = 0, base = 1;  // base = 2^0
        while (binary > 0) {
            int lastDigit = binary % 10;   // get last binary digit
            decimal += lastDigit * base;   // add to decimal
            base *= 2;                     // increase power of 2
            binary /= 10;                  // remove last digit
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        System.out.println("Decimal representation = " + binaryToDecimal(binary));

        sc.close();
    }
}
