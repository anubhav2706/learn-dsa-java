package dsa.basics.specialNumbers;

import java.util.Scanner;

public class UglyNumber {
	
	// function to return factorization as String
    public static String factorize(int n) {
        StringBuilder sb = new StringBuilder();
        int temp = n;

        for (int i = 2; i <= temp; i++) {
            while (n % i == 0) {
                sb.append(i).append(" × ");
                n /= i;
            }
        }

        // remove last " × "
        if (sb.length() >= 3)
            sb.setLength(sb.length() - 3);

        return sb.toString();
    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false; // negative and zero are not ugly
        if (n == 1) return true;  // convention

        // keep dividing by 2, 3, 5
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        // if reduced to 1 → ugly
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String factorization = factorize(num);
        if (isUgly(num))
            System.out.println(num + " = " + factorization + " → ✅ Ugly Number (only 2,3,5 factors)");
        else
            System.out.println(num + " = " + factorization + " → ❌ Not Ugly (contains factors other than 2,3,5)");

        sc.close();
    }
}
