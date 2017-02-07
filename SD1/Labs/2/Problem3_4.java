/**
 *file: Problem3_4.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem3_4 abstract data type.
 */
 
/**
 * Problem3_4
 * 
 * This class randomly generates an integer
 * between 1 and 12 and displays the English
 * month name.
 */
 
//Imports the random number generator.
import java.util.Random;
 
public class Problem3_4{
  public static void main(String[] args) {
	//Creates a random number generator.
	Random monthNum = new Random();
	
	//Generates a number between 1 and 12.
	int random = monthNum.nextInt(12) + 1;
	
	//Prints out month name according to random number generated.
	if (random == 1)
		System.out.println("January");
	else if (random == 2)
		System.out.println("February");
	else if (random == 3)
		System.out.println("March");
	else if (random == 4)
		System.out.println("April");
	else if (random == 5)
		System.out.println("May");
	else if (random == 6)
		System.out.println("June");
	else if (random == 7)
		System.out.println("July");
	else if (random == 8)
		System.out.println("August");
	else if (random == 9)
		System.out.println("September");
	else if (random == 10)
		System.out.println("October");
	else if (random == 11)
		System.out.println("November");
	else if (random == 12)
		System.out.println("December");
  }
}