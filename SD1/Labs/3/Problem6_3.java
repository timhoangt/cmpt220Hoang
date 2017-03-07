/**
*file: Problem6_3.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem6_3 abstract data type.
 */
 
/**
 * Problem6_3
 * 
 * This class returns the reversal of a number and tells you if it is a Palindome.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem6_3{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  //Prompts a number.
  System.out.print("Enter an integer: ");
    int number = input.nextInt();
  
  //Prints answer.
  System.out.println("The reversal of your number is");
  System.out.println((reverse(number)));
  System.out.println("True if your number is a palindome, False if not");
  System.out.println(isPalindome(number));  
  }
  
  //Takes the number and returns the reverse.
  public static int reverse(int number) {
  int reversed = 0;
  
  //Loops until all the digits are read.
  while (number > 0){
    int digit = number % 10;
    number = number / 10;
    reversed = reversed + digit;
    reversed = reversed * 10;
  }
  reversed = reversed / 10;

  return reversed;
  }
  
  //Takes the number and returns a T/F if the number is a palindome.
  public static boolean isPalindome(int number){
    boolean isPalindome = false;  
  if (number == (reverse(number))){
    isPalindome = true;
  }
  else{
    isPalindome = false;
  }
  return isPalindome;
  }
}
