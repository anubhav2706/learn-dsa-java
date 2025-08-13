package dsa.basics;
import java.util.*;

public class Functions {
    
    public static void printMyName(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hey there! What's your name? ");
        String name = sc.nextLine();  // Use nextLine() to handle spaces in names
        
        printMyName(name);
        
        sc.close();
    }
}