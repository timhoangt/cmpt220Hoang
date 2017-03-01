/**
*file: Problem7_9.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem7_18 abstract data type.
 */
 
/**
 * Problem7_18
 * 
 * This class returns the reversal of a number and tells you if it is a Palindome.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem7_18{
  public static void main(String[] args) {
    //Creates a Scanner.
	Scanner input = new Scanner(System.in);
	
	double [] array = new double[10];
}
	

  
  public static void sort(double array){
    double temp;
	for (int i = array.length - 1; i > 0; i--) {
	  for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
			temp = array[j];
			array[j] = array[j + i];
			array[j+ 1] = temp;
		}
	  }
	}
	return array;
  }
}