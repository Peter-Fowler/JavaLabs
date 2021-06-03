package day1.assignment;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean isLeap = false;
		int year;
		
		System.out.println("Enter a year:");
		
		year = input.nextInt();
       

        if(year % 4 == 0){
        	
            if( year % 100 == 0){
            	
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }else
                isLeap = true;
        }else 
            isLeap = false;

        if(isLeap==true)
            System.out.println("The year " + year + " is a leap year!");
        else
            System.out.println("The year " + year + " is not a leap year.");
	
		input.close();
	}

}
