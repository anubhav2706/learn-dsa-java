package dsa.basics;

import java.util.Scanner;

public class MiddleDigit {

    // Function to find the middle digit
    public static int middleDigit(int n) {
        String str = Integer.toString(n);
        int len = str.length();

        if (len % 2 == 1) {
            // Odd length → single middle digit
            return str.charAt(len / 2) - '0';
        } else {
            // Even length → take left middle digit
            return str.charAt((len / 2) - 1) - '0';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Middle digit = " + middleDigit(n));

        sc.close();
    }
}
