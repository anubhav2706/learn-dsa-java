package dsa.basics;

import java.util.Scanner;

public class DigitalRoot {

    public static int findDigitalRoot(int n) {
        while (n >= 10) { // repeat until single digit
            int sum = 0;
            while (n > 0) {
                sum += n % 10;  // add last digit
                n /= 10;
            }
            n = sum; // update number with sum of digits
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Digital Root = " + findDigitalRoot(n));

        sc.close();
    }
}
