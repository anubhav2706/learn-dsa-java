package dsa.numberProperties;

import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length(); // number of digits (works for any length)

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // raise digit to power of total digits
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int n = sc.nextInt();

        // Output
        System.out.println(n + (isArmstrong(n) ? " → Armstrong Number" : " → Not Armstrong"));

        sc.close();
    }
}
