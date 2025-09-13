package dsa.basics;

import java.util.Scanner;

public class InsertDigitAtEnd {

    public static int insertAtEnd(int n, int digit) {
        return n * 10 + digit; // shift left and add digit
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter digit to insert at end: ");
        int d = sc.nextInt();

        int result = insertAtEnd(n, d);
        System.out.println("After inserting: " + result);

        sc.close();
    }
}
