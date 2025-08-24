package dsa.basics;

import java.util.Scanner;

public class CubesOfNumbers {

    public static void printCubes(int n) {
        System.out.println("Cubes of first " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "³ = " + (i * i * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        printCubes(n);

        sc.close();
    }
}

