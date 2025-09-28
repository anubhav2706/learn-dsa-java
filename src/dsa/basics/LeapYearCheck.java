package dsa.basics;

import java.util.Scanner;

public class LeapYearCheck {

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " → Leap Year ✅");
        } else {
            System.out.println(year + " → Not a Leap Year ❌");
        }

        sc.close();
    }
}

