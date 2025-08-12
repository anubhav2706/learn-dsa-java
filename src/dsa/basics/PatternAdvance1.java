package dsa.basics;
import java.util.*;

public class PatternAdvance1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        // Upper part
        for (int i = 1; i <= r; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in middle
            for (int k = 1; k <= 2 * (r - i); k++) {
                System.out.print("  ");
            }
            // Right stars
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part (start from r-1 to avoid duplicate middle row)
        for (int i = r - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (r - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}