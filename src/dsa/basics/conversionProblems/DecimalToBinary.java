package dsa.basics.conversionProblems;

import java.util.Scanner;

public class DecimalToBinary {

    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        String binary = "";
        while (n > 0) {
            int rem = n % 2;          // remainder (0 or 1)
            binary = rem + binary;    // prepend remainder
            n /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        System.out.println("Binary representation = " + decimalToBinary(n));

        sc.close();
    }
}
