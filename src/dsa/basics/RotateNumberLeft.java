package dsa.basics;

import java.util.Scanner;

public class RotateNumberLeft {

    // Function to rotate number left by 1 digit
    public static int rotateLeft(int n) {
        // find number of digits
        int pow = 1;
        int temp = n;
        while (temp >= 10) {
            pow *= 10;
            temp /= 10;
        }

        int firstDigit = temp;   // most significant digit
        int remaining = n % pow; // remove first digit

        // shift first digit to the end
        return remaining * 10 + firstDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rotated = rotateLeft(n);
        System.out.println("After left rotation by 1: " + rotated);

        sc.close();
    }
}
