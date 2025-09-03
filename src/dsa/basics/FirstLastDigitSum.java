package dsa.basics;

import java.util.Scanner;

public class FirstLastDigitSum {

    public static int sumFirstLast(int n) {
        int last = n % 10;   // last digit
        int first = n;       

        while (first >= 10) {   // get first digit
            first /= 10;
        }

        return first + last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of first and last digit = " + sumFirstLast(n));

        sc.close();
    }
}
