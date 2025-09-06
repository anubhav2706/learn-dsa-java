package numberPropeties;

import java.util.Scanner;

public class SunnyNumberCheck {

    // Function to check if a number is perfect square
    public static boolean isPerfectSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    // Function to check sunny number
    public static boolean isSunny(int n) {
        return isPerfectSquare(n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSunny(num)) {
            System.out.println(num + " is a Sunny Number.");
        } else {
            System.out.println(num + " is NOT a Sunny Number.");
        }

        sc.close();
    }
}

