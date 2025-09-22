package dsa.basics.specialNumbers;

import java.util.Scanner;

public class KeithNumber {

    // Function to check Keith number
    public static boolean isKeith(int n) {
        // Step 1: extract digits
        String numStr = Integer.toString(n);
        int d = numStr.length();
        int[] terms = new int[d];

        for (int i = 0; i < d; i++) {
            terms[i] = numStr.charAt(i) - '0';
        }

        int sum = 0, index = d;

        // Step 2: generate sequence
        while (sum < n) {
            sum = 0;
            for (int i = 0; i < d; i++) {
                sum += terms[i];
            }

            // shift left
            for (int i = 0; i < d - 1; i++) {
                terms[i] = terms[i + 1];
            }
            terms[d - 1] = sum;

            if (sum == n) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isKeith(num))
            System.out.println(num + " → Keith Number");
        else
            System.out.println(num + " → Not a Keith Number");

        sc.close();
    }
}
