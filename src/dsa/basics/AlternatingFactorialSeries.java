package dsa.basics;

import java.util.Scanner;

public class AlternatingFactorialSeries {

    // method to calculate factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long sum = 0;

        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            long fact = factorial(i);

            if (i % 2 == 0) {  // even → subtract
                System.out.print("- " + i + "! ");
                sum -= fact;
            } else {           // odd → add
                if (i > 1) System.out.print("+ ");
                System.out.print(i + "! ");
                sum += fact;
            }
        }

        System.out.println("\nSum = " + sum);
        sc.close();
    }
}
