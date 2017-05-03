/**
 *file: Problem3_11.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem3_11 abstract data type.
 */
 
/**
 * Problem3_11
 * 
 * This class prompts a month a year from the user
 * and displays he number of days in the month.
 */
 
//Imports the Scanner.
import java.util.Scanner;
 
public class Problem3_11{
  public static void main(String[] args) {
  
    //Creates a Scanner.
    Scanner input = new Scanner(System.in);
  
    //User inputs the month number and year.
    System.out.print("Enter a month number and year: ");
    int month = input.nextInt();
    int year = input.nextInt();
  
    //Sets initializes number of days.
    int days = 0;
  
    //Assigns a number of days according to which month the user input.
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12: days = 31; break;
      case 4:
      case 6:
      case 9:
      case 11: days = 30; break;
      case 2: days = 28;
    }
  
    //Accounts for February on leap years.
    if (year % 4 == 0 && month == 2)
    days = 29;
  
    //Prints out the number of days in that month and year.
    System.out.println("That month has " + days + " days.");
  }
}