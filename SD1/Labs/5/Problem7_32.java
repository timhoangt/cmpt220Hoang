/**
*file: Problem7_32.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 5
 * due date: March 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem7_32 abstract data type.
 */
 
/**
 * Problem7_32
 * 
 * This class partitions a list using a pivot.
 */
 
//Imports the scanner.
import java.util.Scanner;

public class Problem7_32{
  public static void main(String[] args){
    
    //Creates a scanner.
    Scanner input = new Scanner(System.in);
    
    //Initializes the variable to save input.
    int inputNum;

    //Prompts a list from the user.
    System.out.println("Enter List: ");

    //Sets first inputted integer as the length of the array.
    int listLength = input.nextInt();

    //Initializes the array.
    int [] inputList = new int [listLength];

    //Adds each input to the array.
    for(int i=0; i<listLength; i++){
      inputNum = input.nextInt();
      inputList[i] = inputNum;
    }

    //Calls the partition method.
    partition(inputList);

  }
  
  public static int partition(int[] list){
    
    //Creates empty list with the same length.
    int [] partitionedList = new int [list.length];

    //Sets pivot equal to the first element in the list.
    int pivot = list[0];
    //sets the pivot equal to 0.
    int pSpace = 0; 
    //Loops through the entire list.
    for(int n=1;n<list.length;n++){
      //nth element is added to the list if greater than the pivot
      if(pivot>list[n]){
        partitionedList[pSpace] = list[n];
        pSpace++;
      }
    }
    
    //Add the pivot value to the list 
    partitionedList[pSpace]=pivot;
   
    int newSpace = pSpace; 
    pSpace++;
    
    //Adds elements higher than the pivot to the list.
    for(int j=1;j<list.length;j++){
      if(pivot<list[j]){
        partitionedList[pSpace] = list[j];
        pSpace++;
      } 
    }
    
    //Prints out each element.
    System.out.print("After the partition, the list is ");
    for(int y=0; y<list.length;y++){
      System.out.print(" " + partitionedList[y]);
    }
    System.out.println();
    //Returns the final index of the pivot value.
    return newSpace; 
  }
}