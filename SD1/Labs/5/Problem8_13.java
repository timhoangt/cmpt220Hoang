/**
*file: Problem8_13.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem8_13 abstract data type.
 */
 
/**
 * Problem8_13
 * 
 * This class locates the largest element in a two-dimensional aray.
 */

import java.util.Scanner;

public class Problem8_13 {
	public static void main(String[] args) {
    
    //Creates a scanner.
		Scanner input = new Scanner(System.in);

	  //Prompts a 2d array from the user.
    System.out.println("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    
    //Sizes array.
    double[][] array = new double[row][column];

    //Prompts array data from user.
    System.out.println("Enter the array:");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = input.nextDouble();
      }
    }

    //Gets the location of the largest array.
    int[] location = locateLargest(array);

    //Prints the result.
    System.out.println("The location of the largest element is at (" +
      location[0] + ", " + location[1] + ")");
  }

  //Find the largest element in the array.
  public static int[] locateLargest(double[][] a) {
    int[] o = new int[2];
    o[0] = 0;
    o[1] = 0;
    double max = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > max) {
          o[0] = i;
          o[1] = j;
          max = a[i][j];
        }
      }
    }
    return o;
  }
}