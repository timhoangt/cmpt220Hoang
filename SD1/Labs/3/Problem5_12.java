/**
*file: Problem5_12.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem5_12 abstract data type.
 */
 
/**
 * Problem5_12
 * 
 * This class finds the minimum integer, n, where n^2 > 12,000.
 */

public class Problem5_12{
  public static void main(String[] args) {
  //Initializes the variable.
  int integer = 1;
  
  //Finds the minimum number where n^2  > 12,000.
  while ((integer * integer) < 12000){
    integer ++;
  }
  
  //Prints the answer.
  System.out.println("The smallest n such that n^2 > 12,000 is " + integer);
  }
}