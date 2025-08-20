package dsa.basics;

import java.util.Scanner;

public class PerfectCubeCheck {

    public static boolean isPerfectCube(int n) {
        int cubeRoot = (int) Math.round(Math.cbrt(n)); // nearest integer cube root
        return cubeRoot * cubeRoot * cubeRoot == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfectCube(n)) {
            System.out.println(n + " is a Perfect Cube.");
        } else {
            System.out.println(n + " is NOT a Perfect Cube.");
        }

        sc.close();
    }
}
