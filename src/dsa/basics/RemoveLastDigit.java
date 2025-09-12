package dsa.basics;

import java.util.Scanner;

public class RemoveLastDigit {

    public static int removeLastDigit(int n) {
        return n / 10; // integer division removes the last digit
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = removeLastDigit(n);
        System.out.println("After removing last digit: " + result);

        sc.close();
    }
}
