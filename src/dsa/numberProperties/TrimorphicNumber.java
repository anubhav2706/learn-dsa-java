package dsa.numberProperties;

import java.util.Scanner;

public class TrimorphicNumber {

    // Function to check Trimorphic
    public static boolean isTrimorphic(int n) {
        int cube = n * n * n;

        // Number of digits in n
        int digits = (int) Math.log10(n) + 1;

        // Get last 'digits' digits of cube
        int lastDigits = cube % (int) Math.pow(10, digits);

        return lastDigits == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isTrimorphic(n))
            System.out.println(n + " → Trimorphic Number");
        else
            System.out.println(n + " → Not a Trimorphic Number");

        sc.close();
    }
}
