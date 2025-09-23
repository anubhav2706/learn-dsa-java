package dsa.basics;

import java.util.Scanner;

public class SquarePyramidalSeries {

    // formula for nth square pyramidal number
    public static long pyramidalNumber(int n) {
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Square Pyramidal Number Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(pyramidalNumber(i) + " ");
        }

        sc.close();
    }
}
