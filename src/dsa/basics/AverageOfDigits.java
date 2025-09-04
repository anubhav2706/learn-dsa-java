package dsa.basics;

import java.util.Scanner;

public class AverageOfDigits {

    public static double averageDigits(int n) {
        int sum = 0, count = 0, temp = n;

        while (temp > 0) {
            sum += temp % 10;   // add last digit
            count++;
            temp /= 10;         // remove last digit
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Average of digits = " + averageDigits(n));

        sc.close();
    }
}

