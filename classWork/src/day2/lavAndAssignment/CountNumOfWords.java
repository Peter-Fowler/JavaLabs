package day2.lavAndAssignment;

import java.util.Scanner;

public class CountNumOfWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int count = 1;
		String s;
		
		System.out.println("Enter a string: ");
		
		s = input.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
			
		}
		System.out.println("Number of words in your string is: " + count);

		input.close();
	}

}
