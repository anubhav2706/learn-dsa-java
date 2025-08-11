package dsa.basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop
		int i = 0;
		for(i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		int c = i;
		while(c < 21) {
			System.out.println(c);
			c++;
		}
		
		do {
			System.out.println(c);
			c++;
		}while(c < 31);
	}

}
