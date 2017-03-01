/**
*file: Problem7_9.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem7_9 abstract data type.
 */
 
/**
 * Problem7_9
 * 
 * This class returns the reversal of a number and tells you if it is a Palindome.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem7_9{
  public static void main(String[] args) {
    //Creates a Scanner.
	Scanner input = new Scanner(System.in);
	
	double [] array = new double[10];
	
	System.out.println("Enter ten numbers:");
	
	for (int i = 0; i < 10; i++) {
    array[i] = input.nextDouble();
}
	
	
	//Prints answer.
	System.out.println("The minimum number is:" + (min(array))); 
  }
  
  public static double min(double[] array){
    double min = array[0];
    for (int i = 1; i < 10; i++) {
      if (array[i] < min) {
        min = array[i];
        }
    }
    return min;
  }
}