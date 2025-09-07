package dsa.numberProperties;

import java.util.Scanner;

public class AutomorphicCheck {

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is NOT an Automorphic Number.");
        }

        sc.close();
    }
}

