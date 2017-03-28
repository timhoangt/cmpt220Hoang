/**
*file: Problem7_20.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem7_20 abstract data type.
 */
 
/**
 * Problem7_20
 * 
 * This class reads ten double numbers, 
 * invokes a method, and displays the sorted numbers
 * by swapping the largest number with the last.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem7_20{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    //Prompts and records tens numbers.
    double[] list = new double[10];
    System.out.println("Enter ten numbers: ");
    for(int i = 0; i < list.length; i++) {
      list[i] = input.nextDouble();
    }
    
    //Sends the array to the sorting method.
    selectionSort(list);
  
    //Prints the answer.
    for (double e: list){
      System.out.println(e + " ");
    }
  }
  
  //Recieves number and runs it through equation.
  public static void selectionSort(double[] list) {
    
    //Swaps the larger number with the last one.
    for (int i = list.length - 1; i > 0; i--) {
      double currentMax = list[i];
      int currentMaxIndex = i;
    
      for (int j = i - 1; j >= 0; j--) {
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }
    
      if(currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  } 
}