package day1.lab;
import java.util.Scanner;

public class FourNumbers {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, d = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("inter four numbers: ");

		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();

		if (a >= b && a >= c && a >= d) {
			System.out.println(a + " is the largest number");

		} else if (b >= a && b >= c && b >= d) {
			System.out.println(b + " is the largest number");

		} else if (c >= b && c >= a && c >= d) {
			System.out.println(c + " is the largest number");

		} else if (d >= b && d >= c && d >= a) {
			System.out.println(a + " is the largest number");

		} else
			System.out.println("Something went worng!!");

		input.close();
	}

}
