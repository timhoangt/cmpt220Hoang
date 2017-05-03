/**
 *file: Problem4_25.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem4_25 abstract data type.
 */
 
/**
 * Problem4_25
 * 
 * This class generates a random license plate with three
 * random uppercase letters followed by four random numbers
 */
 
 //Imports the random number generator.
import java.util.Random;
 
public class Problem4_25{
  public static void main(String[] args) {
    //Creates a random number generator.
    Random gen = new Random();
  
    //Generates three random uppercase letters in ASCII code.
    int firstCode = gen.nextInt(25) + 65;
    int secondCode = gen.nextInt(25) + 65;
    int thirdCode = gen.nextInt(25) + 65;
  
    //Generates four random number between 0 and 9 in ASCII code.
    int fourthCode = gen.nextInt(9) + 48;
    int fifthCode = gen.nextInt(9) + 48;
    int sixthCode = gen.nextInt(9) + 48;
    int seventhCode = gen.nextInt(9) + 48;
  
    //Converts ASCII code into characters.
    char firstLet = (char)firstCode;
    char secondLet = (char)secondCode;
    char thirdLet = (char)thirdCode;
    char firstInt = (char)fourthCode;
    char secondInt = (char)fifthCode;
    char thirdInt = (char)sixthCode;
    char fourthInt = (char)seventhCode;
  
    //Prints out the plate number.
    System.out.println(firstLet + "" + secondLet + "" + thirdLet + "" + firstInt
    + "" + secondInt + "" + thirdInt + "" + fourthInt);
  }
}
  
  