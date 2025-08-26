package dsa.basics;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static String decimalToHex(int decimal) {
        String hex = "";
        char[] hexDigits = {'0','1','2','3','4','5','6','7',
                            '8','9','A','B','C','D','E','F'};

        while (decimal > 0) {
            int remainder = decimal % 16;
            hex = hexDigits[remainder] + hex; // prepend
            decimal /= 16;
        }

        return hex.isEmpty() ? "0" : hex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        System.out.println("Hexadecimal representation = " + decimalToHex(decimal));

        sc.close();
    }
}
