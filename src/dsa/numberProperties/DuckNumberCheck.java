package dsa.numberProperties;

import java.util.Scanner;

public class DuckNumberCheck {

    public static boolean isDuckNumber(int num) {
        String str = String.valueOf(num);

        // Leading zero check
        if (str.charAt(0) == '0') {
            return false;
        }

        // Check if contains zero anywhere else
        return str.contains("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isDuckNumber(num)) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is NOT a Duck Number.");
        }

        sc.close();
    }
}
