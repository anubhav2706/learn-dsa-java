package dsa.basics;
import java.util.*;

public class Factorial {
    
    // Method to calculate factorial of a number
    public static int fact(int num) {
        int res = 1; // factorial result
        for (int i = num; i > 0; i--) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();
        
        // Call factorial function
        int ans = fact(num);
        
        // Print result
        System.out.println("Factorial: " + ans);
        
        sc.close();
    }
}