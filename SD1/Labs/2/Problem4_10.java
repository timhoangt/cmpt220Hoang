/**
 *file: Problem4_10.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem4_10 abstract data type.
 */
 
/**
 * Problem4_10
 * 
 * This class guesses the user's birthday with information
 * recieved from the answers given to certain questions.
 */
 
 //Imports the Scanner.
import java.util.Scanner;
 
public class Problem4_10{
  public static void main(String[] args) {
  //Sets up strings that will be displayed in the questions.
    String set1 =
      "1  3  5  7\n" +
      "9  11 13 15\n" +
      "17 19 21 23\n" +
      "25 27 29 31";

    String set2 =
      "2  3  6  7\n" +
      "10 11 14 15\n" +
      "18 19 22 23\n" +
      "26 27 30 31";

  String set3 =
      "4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";

    String set4 =
      "8  9  10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31";
   
  String set5 =
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";
  
  //Sets the initial day integer to 0 and the answer yes as Y.
  int day = 0;
  String yes = "Y";
  
  //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //Prompts the user to answer questions.
  System.out.print("Is your birthday in Set1?\n");
  System.out.print(set1);
  System.out.print("\nEnter Y for Yes and N for No: ");
  String answer1 = input.nextLine();

  //If the user types in Y, 1 is added to the guess.
  if (answer1.equals(yes))
    day = day + 1;
  
  //Prompts the use to answer questions.
  System.out.print("Is your birthday in Set2?\n");
  System.out.print(set2);
  System.out.print("\nEnter Y for Yes and N for No: ");
  String answer21 = input.nextLine();
  
  //If the user types in Y, 2 is added to the guess.
  if (answer21.equals(yes))
    day = day + 2;
  
  //Prompts the use to answer questions.
  System.out.print("Is your birthday in Set3?\n");
  System.out.print(set3);
  System.out.print("\nEnter Y for Yes and N for No: ");
  String answer3 = input.nextLine();
  
  //If the user types in Y, 4 is added to the guess.
  if (answer3.equals(yes))
    day = day + 4;
  
  //Prompts the use to answer questions.
  System.out.print("Is your birthday in Set4?\n");
  System.out.print(set4);
  System.out.print("\nEnter Y for Yes and N for No: ");
  String answer4 = input.nextLine();
  
  //If the user types in Y, 8 is added to the guess.
  if (answer4.equals(yes))
    day = day + 8;
  
  //Prompts the use to answer questions.
  System.out.print("Is your birthday in Set5?\n");
  System.out.print(set5);
  System.out.print("\nEnter Y for Yes and N for No: ");
  String answer5 = input.nextLine();
  
  //If the user types in Y, 16 is added to the guess.
  if (answer5.equals(yes))
    day = day + 16;
  
  //Prints out the guessed birthday.
  System.out.println("\nYour birthday is " + day + "!");
  }
}