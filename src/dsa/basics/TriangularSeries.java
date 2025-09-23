package dsa.basics;

import java.util.Scanner;

public class TriangularSeries {

    // formula for nth triangular number
    public static int triangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Triangular Number Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(triangularNumber(i) + " ");
        }

        sc.close();
    }
}
