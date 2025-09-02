package dsa.basics;

import java.util.Scanner;

public class KaprekarNumber {

    public static boolean isKaprekar(int n) {
        if (n == 1) return true; // 1 is Kaprekar

        long sq = (long) n * n;
        int digits = (int) Math.log10(n) + 1;

        long divisor = (long) Math.pow(10, digits);
        long right = sq % divisor;
        long left = sq / divisor;

        return (left + right) == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isKaprekar(n))
            System.out.println(n + " → Kaprekar Number");
        else
            System.out.println(n + " → Not a Kaprekar Number");

        sc.close();
    }
}

