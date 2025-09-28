package dsa.basics;

import java.util.Scanner;

public class DayOfWeekCalculator {

    public static String getDayOfWeek(int day, int month, int year) {
        if (month < 3) { // Jan & Feb considered as months 13 & 14 of previous year
            month += 12;
            year -= 1;
        }

        int q = day;
        int m = month;
        int K = year % 100;  // Year within century
        int J = year / 100;  // Zero-based century

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;

        switch (h) {
            case 0: return "Saturday";
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
        }
        return "Error";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println(day + "/" + month + "/" + year + " → " + getDayOfWeek(day, month, year));

        sc.close();
    }
}
