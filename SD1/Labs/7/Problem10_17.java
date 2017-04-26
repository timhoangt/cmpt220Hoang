/**
*file: Problem10_17.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem10_17 abstract data type.
 */
 
/**
 * Problem10_17
 * 
 * This class find the first ten numbers greater 
 * than Long.MAX_VALUE.
 */

//Imports the BigInteger class from the java.math package.
import java.math.BigInteger;

public class Problem10_17 {
  /** Main method */
  public static void main(String[] args) {
    
    //Gets the first ten square numbers that are greater than Long.MAX_VALUE.
    BigInteger i = new BigInteger(Long.MAX_VALUE + ""); 
    BigInteger end = i.add(new BigInteger("10"));

    System.out.println("The first ten square numbers that are greater that Long.MAX_VALUE are:");
    
    //Display the results.
    for (i = new BigInteger(Long.MAX_VALUE + ""); 
    i.compareTo(end) <= 0; 
    i = i.add(new BigInteger("1"))) {
      System.out.println(i.multiply(i)); 
    }		
  }
}