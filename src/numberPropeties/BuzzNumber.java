package numberPropeties;

import java.util.Scanner;

public class BuzzNumber {

    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isBuzz(n))
            System.out.println(n + " → Buzz Number");
        else
            System.out.println(n + " → Not a Buzz Number");

        sc.close();
    }
}
