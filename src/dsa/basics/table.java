package dsa.basics;
import java.util.*;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which you wants to print table");
		int n = sc.nextInt();
		System.out.println("Enter the limit till you wants the table of that number");
		int table = sc.nextInt();
		if(n < 1 || table < 1) {
			System.out.println("Enter the values greater than 1");
		}
		for(int i = 1; i <= table; i++) {
			System.out.println(n + " * "+ i + " = " + n*i);
		}

	}

}
