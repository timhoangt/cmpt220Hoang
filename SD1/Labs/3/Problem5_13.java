/**
*file: Problem5_13.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem5_13 abstract data type.
 */
 
/**
 * Problem5_13
 * 
 * This class finds the maximum integer, n, where n^3 < 12,000.
 */

public class Problem5_13{
  public static void main(String[] args) {
  //Initializes the variable.
  int integer = 1;
  
  //Finds the maximum number where n^3  < 12,000.
  while ((integer * integer * integer) < 12000){
    integer ++;
  }
  
  //Subtracts one from the count.
  integer = integer - 1;
  
  //Prints the answer.
  System.out.println("The largest n such that n^3 < 12,000 is " + integer);
  }
}