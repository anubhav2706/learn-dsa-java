package numberPropeties;

import java.util.Scanner;

public class NeonNumberCheck {

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isNeon(num)) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is NOT a Neon Number.");
        }

        sc.close();
    }
}
