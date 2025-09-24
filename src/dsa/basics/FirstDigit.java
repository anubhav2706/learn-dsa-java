package dsa.basics;

import java.util.Scanner;

public class FirstDigit {

    public static int getFirstDigit(int n) {
        n = Math.abs(n);  // handle negative numbers
        while (n >= 10) {
            n /= 10;  // keep dividing until one digit remains
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int firstDigit = getFirstDigit(num);

        System.out.println("First digit of " + num + " = " + firstDigit);

        sc.close();
    }
}
