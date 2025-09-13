package dsa.basics;

import java.util.Scanner;

public class InsertDigitAtBeginning {

    public static int insertAtBeginning(int n, int digit) {
        int temp = n;
        int count = 0;

        // Count digits of n
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Multiply digit by 10^count and add n
        int result = digit * (int)Math.pow(10, count) + n;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter digit to insert at beginning: ");
        int d = sc.nextInt();

        int result = insertAtBeginning(n, d);
        System.out.println("After inserting: " + result);

        sc.close();
    }
}
