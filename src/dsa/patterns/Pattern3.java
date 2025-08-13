package dsa.patterns;
import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();

        if (r < 1) {
            System.out.println("Rows must be greater than 0.");
            sc.close();
            return;
        }

        // Pattern 1: Increasing triangle
        System.out.println("\nPattern 1: Increasing Triangle");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2: Decreasing triangle
        System.out.println("\nPattern 2: Decreasing Triangle");
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Right-aligned triangle
        System.out.println("\nPattern 3: Right-Aligned Triangle");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (j <= r - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}