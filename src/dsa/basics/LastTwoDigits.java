package dsa.basics;

import java.util.Scanner;

public class LastTwoDigits {

    public static int getLastTwoDigits(int n) {
        return Math.abs(n % 100);  // handle negatives also
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastTwo = getLastTwoDigits(num);

        System.out.println("Last two digits of " + num + " = " + lastTwo);

        sc.close();
    }
}

