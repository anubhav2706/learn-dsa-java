package dsa.basics;

import java.util.Scanner;

public class FirstLastDigitDifference {

    public static int diffFirstLast(int n) {
        int last = n % 10;   // last digit
        int first = n;       

        while (first >= 10) {   // get first digit
            first /= 10;
        }

        return Math.abs(first - last);  // absolute difference
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Difference between first and last digit = " + diffFirstLast(n));

        sc.close();
    }
}
