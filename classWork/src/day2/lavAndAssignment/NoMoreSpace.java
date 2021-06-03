package day2.lavAndAssignment;

import java.util.Scanner;

public class NoMoreSpace {

	public static void main(String[] args) {
		
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String: ");

		str = input.nextLine();
		
		str = str.replace(" ", "");
		
		System.out.println("No Space!\n" + str);
		
		input.close();
	}

}
