package dsa.basics;

import java.util.Scanner;

public class CatalanNumberCheck {

    // function to calculate factorial
    public static long fact(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    // function to compute nth Catalan
    public static long catalan(int n) {
        return fact(2 * n) / (fact(n + 1) * fact(n));
    }

    // check if num is a Catalan number
    public static boolean isCatalan(int num) {
        int i = 0;
        while (true) {
            long c = catalan(i);
            if (c == num) return true;
            if (c > num) return false; // sequence strictly increases
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isCatalan(num))
            System.out.println(num + " → Catalan Number");
        else
            System.out.println(num + " → Not a Catalan Number");

        sc.close();
    }
}

