package day2.lavAndAssignment;

import java.util.Scanner;

public class FindSpecificCharacter {

	public static void main(String[] args) {
		
		char find;
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		
		str = input.nextLine();
		
		System.out.println("Enter character to find: ");

		find = input.next().charAt(0);
		
		FindCharater(find, str);
		
		input.close();
	}

	public static void FindCharater(char c, String s) {
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				System.out.println(c + " was found " + (i + 1) + " charater(s) into the string.");
		}
	}
	
}
