package dsa.basics;

import java.util.Scanner;

public class HexToBinary {

    // Step 1: Hexadecimal to Decimal
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        hex = hex.toUpperCase(); // to handle lowercase letters

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9')
                value = ch - '0';
            else
                value = ch - 'A' + 10;

            decimal = decimal * 16 + value;
        }
        return decimal;
    }

    // Step 2: Decimal to Binary
    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        return binary.isEmpty() ? "0" : binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.next();

        int decimal = hexToDecimal(hex);
        String binary = decimalToBinary(decimal);

        System.out.println("Binary representation = " + binary);

        sc.close();
    }
}
