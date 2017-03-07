/**
 *file: Problem4_8.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem4_8 abstract data type.
 */
 
/**
 * Problem4_8
 * 
 * This class prompts an ASCII code and displays
 * its character.
 */
 
 //Imports the Scanner.
import java.util.Scanner;
 
public class Problem4_8{
  public static void main(String[] args) {
  //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //User inputs the ASCII code.
  System.out.print("Enter the ASCII code: ");
  int code = input.nextInt();
  
  //Assigns a character to the code.
  char character = (char)code;
  
  //Prints out the character.
  System.out.println(character);
  }
}