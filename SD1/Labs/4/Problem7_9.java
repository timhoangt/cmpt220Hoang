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
 * This class returns the smallest element in a given array.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem7_9{
  public static void main(String[] args) {
    //Creates a Scanner.
    Scanner input = new Scanner(System.in);
  
    //Initializes an array.
    double [] array = new double[10];
  
    //Prompts and recieves input from the user.
    System.out.println("Enter ten numbers:");
    for (int i = 0; i < 10; i++) {
    array[i] = input.nextDouble();
}
  
  
    //Prints the answer.
    System.out.println("The minimum number is:" + (min(array))); 
  }
  
  public static double min(double[] array){
  //Initializes the minimum value as the first number in the array.
  double min = array[0];
      
      //Changes the minimum value if the next number tested in an array is smaller.
      for (int i = 1; i < 10; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    //Returns the minimum value.
    return min;
  }
}