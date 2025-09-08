package dsa.basics.conversionProblems;

import java.util.Scanner;

public class DecimalToOctal {

    public static int decimalToOctal(int decimal) {
        int octal = 0, place = 1;
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal += remainder * place;  // place = 1, 10, 100... (like octal digits)
            place *= 10;
            decimal /= 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        System.out.println("Octal representation = " + decimalToOctal(decimal));

        sc.close();
    }
}
