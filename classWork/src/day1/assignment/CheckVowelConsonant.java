package day1.assignment;

import java.util.Scanner;

public class CheckVowelConsonant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char c;

		System.out.println("Enter a letter: ");

		c = input.next().charAt(0);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			System.out.println(c + " is a lower case vowel.");
		else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			System.out.println(c + " is an upper case vowel.");
		else if (Character.isUpperCase(c))
			System.out.println(c + " is an upper case consonant.");
		else if (Character.isLowerCase(c))
			System.out.println(c + " is a lower case consonant.");
		else
			System.out.println(c + " is not a letter.");

		if (Character.isLetter(c)) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(c + " is a lower case vowel.");
				break;
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(c + " is an upper case vowel.");
				break;
			default:
				System.out.println(c + " is a consonant.");

			}
		} else
			System.out.println(c + " is not a letter.");
		input.close();
	}

}
