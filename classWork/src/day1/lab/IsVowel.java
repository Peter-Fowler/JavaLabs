package day1.lab;
import java.util.Scanner;

public class IsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter:");
		
		String temp = input.next();
		
		char c = temp.charAt(0);

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
		case 'y':
			System.out.println(c + " maybe a vowel, maybe a consonent." + 
							" All I can tell is it is a lower case letter.");
			break;
		case 'Y':
			System.out.println(c + " maybe a vowel, maybe a consonent." + 
							" All I can tell is it is an upper case letter.");
			break;
		default: {
			if (c > 'a' && c <= 'z') {
				System.out.println(c + " is a lower case consonent.");
			} else if (c > 'A' && c <= 'Z') {
				System.out.println(c + " is an upper case consonent.");
			}
		}
		}
		input.close();
	}
}
