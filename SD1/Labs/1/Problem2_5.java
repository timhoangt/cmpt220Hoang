/**
 *file: Problem2_5.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem2_5 abstract data type.
 */
 
/**
 * Problem2_5
 * 
 * This class calculates the total cost
 * and gratuity of a purchase from a user  
 * input of a subtotal and gratuity rate.
 */

//Imports the Scanner.
import java.util.Scanner;

public class Problem2_5{
  public static void main(String[] args) {
    //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //User inputs a subtotal and a gratuity rate.
  System.out.print("Enter the subtotal and a gratuity rate: ");
  double subtotal = input.nextDouble();
  double gratuityRate = input.nextDouble();
  
  //Calculates the gratuity.
  double gratuity = (gratuityRate / 100) * subtotal;
  
  //Calculates the total.
  double total = subtotal + gratuity;
    
    // Displays the result.
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}