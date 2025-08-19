package dsa.basics;

import java.util.Scanner;

public class PerfectSquareCheck {

    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false; // negative numbers can't be perfect squares

        int sqrt = (int)Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfectSquare(n)) {
            System.out.println(n + " is a Perfect Square.");
        } else {
            System.out.println(n + " is NOT a Perfect Square.");
        }

        sc.close();
    }
}
