package dsa.basics;

import java.util.Scanner;

public class SquaresOfNumbers {

    public static void printSquares(int n) {
        System.out.println("Squares of first " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "² = " + (i * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        printSquares(n);

        sc.close();
    }
}
