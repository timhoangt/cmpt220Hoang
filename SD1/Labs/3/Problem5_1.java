/**
 *file: Problem5_1.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem5_1 abstract data type.
 */
 
/**
 * Problem5_1
 * 
 * This class reads an unspecified number of integers, determines
 * how many positive and negative values have been read, and computes
 * the total and average of the input values (not counting zeros).
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem5_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    //Set an initial value for the variables.
    int data;
    float total = 0;
    int pos = 0;
    int neg = 0;
    int sum = 0;
  
    //Reads the input until the 0 is the input.
    do{
      System.out.print("Enter an integer, the input ends if it is 0: ");
      data = input.nextInt();
    
      //If it is above 0, the amount of positive integers increases by one.
      if (data > 0)
      pos ++;
      //If it is below 0, the amount of negative integers increases by one.
      else if (data < 0)
      neg ++;
      else;
      //The total amout of integers is increased by one.
      total ++;
      //A sum is calculated.
      sum += data;
    }
    while (data != 0);
  
    //The average is calculated.
    float avg = sum / (total-1);
  
    //Prints out all of the information.
    System.out.println("The number of positives is " + pos);
    System.out.println("The number of negatives is " + neg);
    System.out.println("The total is " + total);
    System.out.println("The average is " + avg);
  }
}