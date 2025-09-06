package dsa.basics;

import java.util.Scanner;

public class SecondLastDigit {

    public static int getSecondLastDigit(int n) {
        if (n < 10) {
            return -1; // indicates no second last digit
        }
        return (n / 10) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = getSecondLastDigit(n);

        if (result == -1)
            System.out.println("The number has no second last digit.");
        else
            System.out.println("Second last digit = " + result);

        sc.close();
    }
}

