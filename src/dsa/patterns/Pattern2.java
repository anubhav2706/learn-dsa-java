package dsa.patterns;
import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();

        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        if (r < 1 || c < 1) {
            System.out.println("Rows and columns must be greater than 0.");
            sc.close();
            return;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {					
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}