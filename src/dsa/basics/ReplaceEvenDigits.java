package dsa.basics;

import java.util.Scanner;

public class ReplaceEvenDigits {

    public static int replaceEvenWithZero(int n) {
        int result = 0, place = 1;

        while (n > 0) {
            int digit = n % 10;

            // If digit is even, replace with 0
            if (digit % 2 == 0) {
                digit = 0;
            }

            // Build the new number
            result = result + digit * place;
            place *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = replaceEvenWithZero(num);
        System.out.println("After replacing even digits with 0: " + ans);

        sc.close();
    }
}
