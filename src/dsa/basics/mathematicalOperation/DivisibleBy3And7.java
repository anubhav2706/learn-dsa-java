package dsa.basics.mathematicalOperation;

import java.util.Scanner;

public class DivisibleBy3And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Numbers between 1 and " + n + " divisible by both 3 and 7:");

        for (int i = 1; i <= n; i++) {
            if (i % 21 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}

