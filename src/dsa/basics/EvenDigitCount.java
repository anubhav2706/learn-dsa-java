package dsa.basics;

import java.util.Scanner;

public class EvenDigitCount {

    public static int countEvenDigits(int n) {
        int count = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) count++;  // check even
            temp /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Count of even digits = " + countEvenDigits(n));

        sc.close();
    }
}
