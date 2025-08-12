package dsa.basics;
import java.util.*;

public class PatternAdvance2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // Spaces on the left
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= r; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        sc.close();
    }
}