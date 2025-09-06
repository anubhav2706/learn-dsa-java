package dsa.basics;

import java.util.Scanner;

public class LastDigitCount {

    public static int countLastDigit(int n) {
        int last = n % 10;  // last digit
        int count = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == last) count++;
            temp /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int last = n % 10;
        int count = countLastDigit(n);

        System.out.println("Last digit = " + last);
        System.out.println("It appears " + count + " time(s) in " + n);

        sc.close();
    }
}

