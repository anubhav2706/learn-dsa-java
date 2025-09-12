package dsa.basics;

import java.util.Scanner;

public class RemoveFirstDigit {

    // Function to remove first digit
    public static int removeFirstDigit(int n) {
        int pow = 1;
        int temp = n;

        // find place value of the first digit
        while (temp >= 10) {
            temp /= 10;
            pow *= 10;
        }

        return n % pow; // removes the first digit
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = removeFirstDigit(n);
        System.out.println("After removing first digit: " + result);

        sc.close();
    }
}
