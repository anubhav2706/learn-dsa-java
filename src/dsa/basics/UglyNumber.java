package dsa.basics;

import java.util.Scanner;

public class UglyNumber {

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

        if (isUgly(num))
            System.out.println(num + " → Ugly Number");
        else
            System.out.println(num + " → Not an Ugly Number");

        sc.close();
    }
}
