package dsa.basics;

import java.util.Scanner;

public class AlternatingSumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {   // even → subtract
                System.out.print("- " + i + " ");
                sum -= i;
            } else {            // odd → add
                if (i > 1) System.out.print("+ ");
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum = " + sum);
        sc.close();
    }
}
