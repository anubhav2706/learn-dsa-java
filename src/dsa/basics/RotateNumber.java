package dsa.basics;

import java.util.Scanner;

public class RotateNumber {

    // Function to rotate a number right by 1 digit
    public static int rotateRight(int n) {
        int lastDigit = n % 10;    // extract last digit
        int remaining = n / 10;    // remove last digit

        // find number of digits in remaining part
        int pow = 1;
        int temp = remaining;
        while (temp > 0) {
            pow *= 10;
            temp /= 10;
        }

        // place last digit at front
        return lastDigit * pow + remaining;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rotated = rotateRight(n);
        System.out.println("After right rotation by 1: " + rotated);

        sc.close();
    }
}
