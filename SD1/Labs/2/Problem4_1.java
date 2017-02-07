/**
 *file: Problem4_1.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem4_1 abstract data type.
 */
 
/**
 * Problem4_1
 * 
 * This class prompts a length from the center to 
 * a vertex of a pentgon and computes the area.
 */
 
//Imports the Scanner.
import java.util.Scanner;
 
public class Problem4_1{
  public static void main(String[] args) {
	//Creates a Scanner.
	Scanner input = new Scanner(System.in);
	
	//User inputs the length from the center to a vertex.
	System.out.print("Enter a length from the center to a vertex of a pentagon: ");
	double length = input.nextDouble();
	
	//Calculates the length of a side.
	double side = (2 * length) * Math.sin(Math.PI / 5);
	
	//Calculates the area.
	double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
	
	//Rounds the area to two decimal places.
	double areaRounded = Math.round(area * 100) / 100.0;
	
	//Prints out the area.
	System.out.println("That pentagon has an area of " + areaRounded);
  }
}