/**
 *file: Problem3_8.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem3_4 abstract data type.
 */
 
/**
 * Problem3_8
 * 
 * This class prompts three integers from the user
 * and displays them in non-decreasing order.
 */
 
 //Imports the Scanner.
import java.util.Scanner;
 
public class Problem3_8{
  public static void main(String[] args) {
    
    //Creates a Scanner.
    Scanner input = new Scanner(System.in);
  
    //User inputs 3 integers.
    System.out.print("Enter 3 integers: ");
    int firstInt = input.nextInt();
    int secondInt = input.nextInt();
    int thirdInt = input.nextInt();
  
    //Orders the numbers by value and prints them in that order.
    if (firstInt <= secondInt
    && firstInt <= thirdInt
    && secondInt <= thirdInt)
    System.out.println(firstInt + ", " + secondInt + ", " + thirdInt);
     
    else if (firstInt <= secondInt
    && firstInt <= thirdInt
    && thirdInt <= secondInt)
    System.out.println(firstInt + ", " + thirdInt + ", " + secondInt);   
  
    else if (secondInt <= firstInt
    && firstInt <= thirdInt
    && secondInt <= thirdInt)
    System.out.println(secondInt + ", " + firstInt + ", " + thirdInt);
     
    else if (secondInt <= firstInt
    && thirdInt <= firstInt
    && secondInt <= thirdInt)
    System.out.println(secondInt + ", " + thirdInt + ", " + firstInt);   
     
    else if (thirdInt <= firstInt
    && firstInt <= secondInt
    && thirdInt <= secondInt)
    System.out.println(thirdInt + ", " + firstInt + ", " + secondInt);
     
    else if (thirdInt <= firstInt
    && secondInt <= firstInt
    && thirdInt <= secondInt)
    System.out.println(thirdInt + ", " + secondInt + ", " + firstInt);   
  }
}