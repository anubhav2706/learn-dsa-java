package dsa.basics.sequenceProblems;
import java.util.Scanner;

public class FibonacciSequence {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = sc.nextInt();

        // Print Fibonacci sequence
        System.out.println("Fibonacci Sequence:");
        printFibonacci(n);

        sc.close();
    }
}

