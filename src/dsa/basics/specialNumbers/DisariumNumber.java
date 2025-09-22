package dsa.basics.specialNumbers;

import java.util.Scanner;

public class DisariumNumber {

    // function to count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // function to check Disarium
    public static boolean isDisarium(int n) {
        int digits = countDigits(n);
        int temp = n, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // raise to power of position
            digits--;
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isDisarium(num))
            System.out.println(num + " → Disarium Number");
        else
            System.out.println(num + " → Not a Disarium Number");

        sc.close();
    }
}
