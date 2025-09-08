package dsa.basics;

import java.util.Scanner;

public class CatalanSeries {

    // Function to generate Catalan numbers up to n terms
    public static void printCatalan(int n) {
        long catalan = 1;  // C0 = 1
        System.out.print(catalan + " "); 

        for (int i = 0; i < n - 1; i++) {
            catalan = catalan * 2 * (2 * i + 1) / (i + 2);  // recurrence
            System.out.print(catalan + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Catalan Sequence up to " + n + " terms:");
        printCatalan(n);

        sc.close();
    }
}
