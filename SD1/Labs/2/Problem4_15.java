/**
 *file: Problem4_15.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem4_15 abstract data type.
 */
 
/**
 * Problem4_15
 * 
 * This class prompts a letter from the user and find the
 * corresponding number to press on the phone to get that letter.
 */
 
 //Imports the Scanner.
import java.util.Scanner;
 
public class Problem4_15{
  public static void main(String[] args) {
  //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //Prompts the user to enter a letter.
    System.out.print("Enter a letter: ");
  String letter = input.nextLine();
  
  //Sets the initial number to 0 since it is not used when typing on the phone.
  int number = 0;
  
  //Finds the number that corresponds with each letter.
  switch (letter) {
    case "a":
    case "A": 
    case "b":
    case "B":
    case "c":
    case "C": number = 2; break;
    case "d":
    case "D":
    case "e":
    case "E":
    case "f":
    case "F": number = 3; break;
    case "g":
    case "G":
    case "h":
    case "H":
    case "i":
    case "I": number = 4; break;
    case "j":
    case "J":
    case "k":
    case "K":
    case "l":
    case "L": number = 5; break;
    case "m":
    case "M":
    case "n":
    case "N":
    case "o":
    case "O": number = 6; break;
    case "p":
    case "P":
    case "q":
    case "Q":
    case "r":
    case "R":
    case "s":
    case "S": number = 7; break;
    case "t":
    case "T":
    case "u":
    case "U":
    case "v":
    case "V": number = 8; break;
    case "w":
    case "W":
    case "x":
    case "X":
    case "y":
    case "Y":
    case "z":
    case "Z": number = 9;
    }
  
  //Exits the program if the user doesn't input a letter.
  if (number == 0)
      System.out.println(letter + " is an invalid input.");
  if (number == 0)
      System.exit(1);
    
  //Prints out the corresponding number.
  System.out.println("The corresponding number is " + number);
  }
}