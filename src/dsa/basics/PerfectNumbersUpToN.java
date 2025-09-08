package dsa.basics;

import java.util.Scanner;

public class PerfectNumbersUpToN {

    // Function to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num && num != 1;
    }

    // Print all perfect numbers up to n
    public static void printPerfectNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit n: ");
        int n = sc.nextInt();

        System.out.println("Perfect numbers up to " + n + ":");
        printPerfectNumbers(n);

        sc.close();
    }
}
