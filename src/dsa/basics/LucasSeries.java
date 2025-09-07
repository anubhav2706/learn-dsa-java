package dsa.basics;

import java.util.Scanner;

public class LucasSeries {

    public static void printLucas(int n) {
        int a = 2, b = 1;

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Lucas Series up to " + n + " terms: ");
        printLucas(n);

        sc.close();
    }
}
