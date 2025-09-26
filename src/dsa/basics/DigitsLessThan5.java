package dsa.basics;

import java.util.Scanner;

public class DigitsLessThan5 {

    public static int countLessThan5(int n) {
        n = Math.abs(n); // handle negatives
        int count = 0;

        while (n > 0) {
            int digit = n % 10;  // extract last digit
            if (digit < 5) {
                count++;
            }
            n /= 10;  // remove last digit
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countLessThan5(num);

        System.out.println("Digits less than 5 in " + num + " = " + result);

        sc.close();
    }
}
