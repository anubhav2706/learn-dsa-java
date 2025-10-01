package dsa.basics.mathematicalOperation;

import java.util.Scanner;

public class DivisibilityCheck {

    public static void checkDivisibility(int n) {
        System.out.println("Checking divisibility for " + n + ":");

        if (n % 2 == 0)
            System.out.println(n + " is divisible by 2");
        else
            System.out.println(n + " is not divisible by 2");

        if (n % 3 == 0)
            System.out.println(n + " is divisible by 3");
        else
            System.out.println(n + " is not divisible by 3");

        if (n % 5 == 0)
            System.out.println(n + " is divisible by 5");
        else
            System.out.println(n + " is not divisible by 5");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check divisibility
        checkDivisibility(n);

        sc.close();
    }
}
