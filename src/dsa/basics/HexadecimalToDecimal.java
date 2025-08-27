package dsa.basics;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static int hexToDecimal(String hex) {
        hex = hex.toUpperCase(); // handle both lower & upper case
        int decimal = 0;
        int base = 1; // 16^0

        // Process from rightmost digit
        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);

            if (c >= '0' && c <= '9') {
                decimal += (c - '0') * base;
            } else if (c >= 'A' && c <= 'F') {
                decimal += (c - 'A' + 10) * base;
            } else {
                throw new IllegalArgumentException("Invalid Hexadecimal Digit: " + c);
            }

            base *= 16;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.next();

        System.out.println("Decimal representation = " + hexToDecimal(hex));

        sc.close();
    }
}
