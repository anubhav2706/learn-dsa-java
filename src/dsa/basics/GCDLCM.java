package dsa.basics;
import java.util.Scanner;

public class GCDLCM {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculate and print results
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " = " + lcm(a, b));

        sc.close();
    }
}
