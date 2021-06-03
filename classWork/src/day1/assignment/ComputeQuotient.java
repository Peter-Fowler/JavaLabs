package day1.assignment;

import java.util.Scanner;

public class ComputeQuotient {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int q;
		int r;

		System.out.println("Enter a number for X in X/Y:");

		x = input.nextInt();

		System.out.println("Enter a number for Y in X/Y:");

		y = input.nextInt();
		
		if (y == 0) {
			System.out.println("You cannot divide by 0");
			System.exit(0);
		}
		
		q = x / y;
		
		r = x % y;

		System.out.println("The Quotient is: " + q + "\nThe Remainder is: " + r);
	
		input.close();
	}

}
