package dsa.basics;

import java.util.*;

public class MinDigitDifference {

    public static int minDifference(int n) {
        n = Math.abs(n); // handle negatives

        // extract digits
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        // if only one digit, no difference possible
        if (digits.size() < 2) return 0;

        // sort digits
        Collections.sort(digits);

        int minDiff = Integer.MAX_VALUE;

        // compare consecutive digits
        for (int i = 1; i < digits.size(); i++) {
            int diff = digits.get(i) - digits.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = minDifference(num);

        System.out.println("Minimum difference between two digits in " + num + " = " + result);

        sc.close();
    }
}
