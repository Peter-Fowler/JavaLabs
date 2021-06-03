package day1.assignment;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
	
		librarian();
		
	}
	public static void librarian() {
		Scanner input = new Scanner(System.in);
		
		int iSBN;
		String name;
		String author;
		double price;
		int noOfCopiesPrinted;
		String temp;
		
		System.out.println("Enter the ISBN: ");
		
		iSBN = input.nextInt();
		temp = input.nextLine();
		
		System.out.println("Enter the Name: ");
		
		name = input.nextLine();
		
		System.out.println("Enter the Auther: ");
		
		author = input.nextLine();
		
		System.out.println("Enter the price: ");
		
		price = input.nextDouble();
		temp = input.nextLine();
		
		System.out.println("Enter the Number of copies printed: ");
		
		noOfCopiesPrinted = input.nextInt();
		
		System.out.println("Book: " + name + "\nAuther: " + author + "\nPrice: " + price 
				+ "\nISBN: " + iSBN + "\nNumber of copies printed: " + noOfCopiesPrinted);
		
		input.close();
		
	}

}
