package day1.assignment;

import java.util.Scanner;

public class CountLetterNumberSpace {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s;
		int vowel = 0;
		int consonant = 0;
		int digits = 0;
		int space = 0;
		
		System.out.println("Enter a String: ");
		
		s = input.nextLine();
		
		input.close();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				space++;
			}else if (Character.isLetter(s.charAt(i))) {
				switch (s.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'O':
				case 'I':
				case 'U':
					vowel++;
					break;
					default:
						consonant++;
				}
			}else if (Character.isDigit(s.charAt(i))) {
				digits++;
			}
		}
		
		System.out.println("The input: " + s + "\nNumber of Vowels: " + vowel + "\nNumber of Consonants: " + 
					consonant + "\nNumber of Spaces: " + space + "\nNumber of Digits: " + digits);

	}

}
