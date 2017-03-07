/**
*file: Problem6_2.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem6_2 abstract data type.
 */
 
/**
 * Problem6_2
 * 
 * This class computes the sum of the digits in an integer.
 */
 
//Imports the Scanner.
import java.util.Scanner;

public class Problem6_2{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  //Prompts a number.
  System.out.print("Enter an integer: ");
    long n = input.nextLong();
  long answer = sumDigits(n);
  
  //Prints the answer.
  System.out.println("The sum of the digits in your integer is " + answer);
  }
  
  //Recieves number and runs it through equation.
  public static int sumDigits(long n) {
  int sum = 0;
  int m = (int) n;
  
  //Loops until all the digits are read.
  while (m > 0){
    int digit = m % 10;
    m = m / 10;
    sum = sum + digit;
  }

  return sum;
  } 
}
