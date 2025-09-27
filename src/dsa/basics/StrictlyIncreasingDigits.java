package dsa.basics;

import java.util.Scanner;

public class StrictlyIncreasingDigits {

    public static boolean isStrictlyIncreasing(int n) {
        n = Math.abs(n); // handle negatives

        int prev = 10; // since digit max is 9, start with 10

        while (n > 0) {
            int curr = n % 10;
            if (curr >= prev) {
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

        if (isStrictlyIncreasing(num)) {
            System.out.println(num + " → Digits are in strictly increasing order ✅");
        } else {
            System.out.println(num + " → Digits are NOT in strictly increasing order ❌");
        }

        sc.close();
    }
}
