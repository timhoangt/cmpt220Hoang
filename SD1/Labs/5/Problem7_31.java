/**
*file: Problem7_31.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem7_31 abstract data type.
 */
 
/**
 * Problem7_31
 * 
 * This class merges two sorted lists into a new sorted list.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem7_31{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    //User inputs the lists.
    //The first number of each list is recorded as the list length.
    System.out.print("Enter list1: ");
    int i = input.nextInt();
    int[] list1 = new int[i];
    for (int z = 0; z < i; z++){
      list1[z] = input.nextInt();
    }
  
    System.out.print("Enter list2: ");
    int j = input.nextInt();
    int[] list2 = new int[j];
    for (int z = 0; z < j; z++){
      list2[z] = input.nextInt();
    }
    
    //Sends the arrays to the merge method.
    int[] list3 = merge(list1, list2);
    
    //Prints the answer.
    System.out.print("The merged list is ");
    for(int e: list3){
      System.out.print(" " + e);
    }
  }
  
  //Recieves arrays and runs it through equation.
  public static int[] merge(int[] list1, int[] list2) {
    
    //Create the length of the new array.
    int[] mergedList = new int[list1.length + list2.length];
    
    //Combines list1 with the new array.
    for(int i = 0; i < list1.length; i++) {
     	mergedList[i] = list1[i];
    }
    
    //Conbines list2 with the new array.
    for(int i = 0, j = list1.length; i < list2.length; i++, j++) {
    	mergedList[j] = list2[i];
    }
    
    //Sends the new list to the sorting method.
    sortMerge(mergedList);
    return mergedList;
    }
  
  //Recieves the array and sorts it.
  public static void sortMerge(int[] list) {
    
    //Swaps the largest number with the last number.
    for (int i = list.length - 1; i > 0; i--) {
      int currentMax = list[i];
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