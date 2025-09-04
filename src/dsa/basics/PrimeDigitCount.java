package dsa.basics;

import java.util.Scanner;

public class PrimeDigitCount {

    public static int countPrimeDigits(int n) {
        int count = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            temp /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Count of prime digits = " + countPrimeDigits(n));

        sc.close();
    }
}

