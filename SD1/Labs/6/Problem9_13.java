/**
*file: Problem9_13.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem9_13 abstract data type.
 */
 
/**
 * Problem9_13
 * 
 * This class gets the location of a maximal value in a 
 * two dimensional array.
 */


//Imports a scanner.
import java.util.Scanner;

public class Problem9_13 {
  public static void main(String[] args) {
  	
    //Prompts array dimensions from the user.
  	System.out.print("Enter the number of rows and columns in the array: ");
    Scanner input = new Scanner(System.in);
    int userRow = input.nextInt();
    int userColumn = input.nextInt();

    //Prompts an array from the user.
    System.out.println("Enter the array:");
    double [][] userArray = new double[userRow][userColumn];
    
    //Creates the two dimensional aray with the for loop.
    for(int i=0;i<userArray.length;i++){
      for(int n =0; n<userArray[i].length;n++){
 		userArray[i][n] = input.nextDouble();
      }
    }

    Location finalSolution = Location.locateLargest(userArray);
    
    //Prints the answer.
    System.out.println("The location of the largest element is " + 
    	finalSolution.maxValue + " at (" + finalSolution.row + ", " + 
    	finalSolution.column + ")");
  }


}
//Initializes the Location class.
class Location{
  
  //Initializes row, column, and maxValue variables.
  int row; 
  int column; 
  double maxValue; 
  
  //Constructor for the location object.
  Location(){

  }
  
  public Location(int row, int column, double maxValue){
  	this.row = row;
  	this.column = column;
  	this.maxValue = maxValue;
  }
  
  public static Location locateLargest(double[][] a){
    
    int row=0;
    int column=0;
    double maxValue = a[row][column]; 
    
    //Loop goes through each row and column when neccessary.
    for(int i=0;i<a.length;i++){
      for(int n=0;n<a[i].length;n++){
        
        //Sees if the current value is bigger than the previous maxValue.
        if(a[i][n]>maxValue){
          
          //If the element is bigger, it becomes the new maxValue.
      	  maxValue=a[i][n];
          
      	  //Sets the row and column values to the position of the new maxValue.
      	  row = i;
      	  column = n;
        }
      }
    }
    //Returns the coordinates of the maxValue.
    return new Location(row,column,maxValue);	
  }
}