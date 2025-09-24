package dsa.basics;

import java.util.Scanner;

public class FirstTwoDigits {

    public static int getFirstTwoDigits(int n) {
        n = Math.abs(n);  // handle negatives
        while (n >= 100) {  // reduce until only two digits remain
            n /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int firstTwo = getFirstTwoDigits(num);

        System.out.println("First two digits of " + num + " = " + firstTwo);

        sc.close();
    }
}
