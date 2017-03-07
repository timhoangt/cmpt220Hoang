/**
*file: Problem5_12.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Driver_lab3 abstract data type.
 */
 
/**
 * Driver_lab3
 * 
 * This class computes the p-norm between pairs of points for a given value p.
 */
 
//Imports the Scanner.
import java.util.Scanner;
 
public class Driver_lab3{
  public static void main(String[] args) {
  //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //Initialized the variables.
  double x1 = input.nextDouble();
  double y1;
  double x2;
  double y2;
  double p;
  double answer3; 
  
  //Loops the equation as long as the user does not enter 0.
  while (x1 != 0){
    //Inputs for the variables.
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    p = input.nextDouble();
    
    //Calculates the answer.
    double answer1 = (Math.pow(Math.abs(x1 - x2), p)) + (Math.pow(Math.abs(y1 - y2), p));
    double answer2 = 1 / p;
    answer3 = Math.pow(answer1, answer2);
    
    //Stops it at ten decimal places.
    System.out.printf("%.10f", answer3);
    System.out.println("");
    x1 = input.nextDouble();
  }
  }
}