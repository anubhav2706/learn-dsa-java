package dsa.basics;

import java.util.Scanner;

public class StrictlyDecreasingDigits {

    public static boolean isStrictlyDecreasing(int n) {
        n = Math.abs(n); // handle negatives too

        int prev = -1; // since digit min is 0, start with -1

        while (n > 0) {
            int curr = n % 10;
            if (curr <= prev) {
                return false;
            }
            prev = curr;
            n /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isStrictlyDecreasing(num)) {
            System.out.println(num + " → Digits are in strictly decreasing order ✅");
        } else {
            System.out.println(num + " → Digits are NOT in strictly decreasing order ❌");
        }

        sc.close();
    }
}
