/**
 *file: Problem4_5.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem4_5 abstract data type.
 */
 
/**
 * Problem4_5
 * 
 * This class prompts the number and length of the sides
 * of a regular polygon and calculates the area.
 */
 
 //Imports the Scanner.
import java.util.Scanner;
 
public class Problem4_5{
  public static void main(String[] args) {
  //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //User inputs the number of sides in the regular polygon.
  System.out.print("Enter the number of sides: ");
  double sides = input.nextDouble();
  
  //User inputs the length of the sides in the regular polygon.
  System.out.print("Enter the length of the sides: ");
  double length = input.nextDouble();
  
  //Calculates the area.
  double area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
  
  //Prints out the area.
  System.out.println("That regular polygon has an area of " + area);
  }
}