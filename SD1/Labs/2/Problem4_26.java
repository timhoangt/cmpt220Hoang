/**
 *file: Problem4_26.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem4_26 abstract data type.
 */
 
/**
 * Problem4_26
 * 
 * This class finds out how much of each currency type
 * should be given for the amount of change needed.
 */
 
 //Imports the scanner.
import java.util.Scanner;
 
public class Problem4_26{
  public static void main(String[] args) {
	//Creates a scanner.
	Scanner input = new Scanner(System.in);
	
	//Receive the amount.
	System.out.print("Enter an amount: ");
	String amount = input.nextLine();
	
	//Converts the substrings into integers.
	int dollars = Integer.parseInt(amount.substring(0, 2));
	int cents = Integer.parseInt(amount.substring(3));
	
	//Finds out how many quarters are needed.
	int quarters = cents / 25;
	cents = cents % 25;
	
	//Finds out how many dimes are needed.
	int dimes = cents / 10;
	cents = cents % 10;
	
	//Finds out how many nickels are needed.
	int nickels = cents / 5;
	cents = cents % 5;
	
	//Finds out how many pennies are needed.
	int pennies = cents;
	
	//Prints out the change needed.
	System.out.println("Your amount " + amount + " consists of");
	System.out.println("     " + dollars + " dollars");
	System.out.println("     " + quarters + " quarters");
	System.out.println("     " + dimes + " dimes");
	System.out.println("     " + nickels + " nickels");
	System.out.println("     " + pennies + " pennies");
  }
}