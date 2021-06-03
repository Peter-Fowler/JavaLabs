package day1.lab;
import java.util.Scanner;

public class GetBook {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int bookNumber;
		String bookName;
		
		System.out.println("Inter the book name.");

		bookName = input.nextLine();		
		
		System.out.println("Inter the book number.");
		
		bookNumber = input.nextInt();
		
		System.out.println("Book Number: " + bookNumber + "\nBook Name: " + bookName);

		input.close();
	}

}
