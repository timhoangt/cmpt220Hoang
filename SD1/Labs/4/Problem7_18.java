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
 * This class uses the bubble sorting technique to put an array in order.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem7_18{
  public static void main(String[] args) {
    //Creates a Scanner.
    Scanner input = new Scanner(System.in);
    double array[]= new double[10];
  
    //Prompts ten numbers from the user.
    System.out.println("Please enter ten numbers:");
    for (int i = 0; i < array.length; i++){
      array[i] = input.nextDouble();
    }
  
    //Sorts the array. 
    sort(array);
    
    
    //Prints the sorted array.
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + ", ");
    }
  }
  

  
  public static void sort(double[] array){
    
    //Initializes the temperary storage and a value for the length of the array.
    double temp = 0;
    int x = array.length;
     
    //Swaps two integers according to their values and repeats until the array is in order.
    for(int i = 0; i < x; i++){
      for(int o = 1; o < (x-i); o++){
        if(array[o-1] > array[o]){
          temp = array[o-1];
          array[o-1] = array[o];
          array[o] = temp;
        }
      }
    }
  }
}
    