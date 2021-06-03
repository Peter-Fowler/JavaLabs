package day1.assignment;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int i;
		
		System.out.println("Enter a whole number:");
		
		i = input.nextInt();

		if (i > 0)
			System.out.println(i + " is positive.");
		else if (i < 0)
			System.out.println(i + " is negative.");
		else
			System.out.println(i + " is " + i + ".");
	
		input.close();
	}

}
