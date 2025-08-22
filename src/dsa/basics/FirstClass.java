package dsa.basics;

import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String head = sc.nextLine();
//		System.out.println(head);
		System.out.println("Hello "+head+ " Please enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.print("The sum of two entered numbers: "+ a + " + " + b + " = " + sum);
		
		sc.close();

	}

}
