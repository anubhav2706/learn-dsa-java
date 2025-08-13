package dsa.patterns;
import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("\nPattern 1: Increasing Number Triangle");
        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 2: Decreasing Number Triangle");
        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= r-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 3: Continuous Number Triangle");
        int count = 1;
        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println("\nPattern 4: 0–1 Triangle");
        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0 ) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}