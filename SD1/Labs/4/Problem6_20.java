/**
*file: Problem6_20.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem6_20 abstract data type.
 */
 
/**
 * Problem6_20
 * 
 * This class counts the amount of letters in any given String.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem6_20{
  public static void main(String[] args) {
    //Creates a Scanner.
    Scanner input = new Scanner(System.in);
  
    //Initialized the variables.
    String s = input.nextLine();
  
    //Prints answer.
    System.out.println((countLetters(s))); 
  }
  
  public static int countLetters(String s){
    //For every character between a and z, the counter goes up by one.
    int count = 0;
    for(int i=0;i<s.length();i++){ 
      if((s.charAt(i) >='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) 
      count++; 

      else;
  }
    //Returns count value.
    return count;
  
    }
  }