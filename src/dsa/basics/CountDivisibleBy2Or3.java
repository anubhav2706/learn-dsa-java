package dsa.basics;

import java.util.Scanner;

public class CountDivisibleBy2Or3 {

    public static int countDivisible(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Count of numbers divisible by 2 or 3 from 1 to " + n + " = " + countDivisible(n));

        sc.close();
    }
}

