package dsa.basics;

import java.util.Scanner;

public class SumOfCubesDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;       // extract last digit
            sum += digit * digit * digit; // add cube
            temp /= 10;                 // remove last digit
        }

        System.out.println("Sum of cubes of digits of " + num + " = " + sum);
        sc.close();
    }
}
