/**
 *file: Problem3_15.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 7, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem3_15 abstract data type.
 */
 
/**
 * Problem3_15
 * 
 * This class prompts a three digit lottery guess
 * and determines what the user wins based on the
 * random lottery number
 */
 
//Imports the Scanner.
import java.util.Scanner;
 
public class Problem3_15{
  public static void main(String[] args) {
  //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //Initializes the winnings as an integer.
  int winnings = 0;
  
  //Generates a lottery number.
  int lottery1 = (int)(Math.random() * 1000);
  
  //User inputs the lottery guess.
  System.out.print("Enter your lottery pick (three digits): ");
  int guess1 = input.nextInt();
  
  //Get digits from lottery.
  int lotteryDigit3 = lottery1 % 10;
  int lottery2 = lottery1 / 10;
  int lotteryDigit2 = lottery2 % 10;
  int lotteryDigit1 = lottery2 / 10;
  
  //Get digits from guess.
  int guessDigit3 = guess1 % 10;
  int guess2 = guess1 / 10;
  int guessDigit2 = guess2 % 10;
  int guessDigit1 = guess2 / 10;
  
  //Prints lottery number.
  System.out.println("The lottery number is " + lottery1);
  
  //Compares and counts the amount of digits that are the same.
  if (lotteryDigit1 == guessDigit1
    || lotteryDigit1 == guessDigit2
    || lotteryDigit1 == guessDigit3)
    winnings = winnings + 1;
    
  if (lotteryDigit2 == guessDigit1
    || lotteryDigit2 == guessDigit2
    || lotteryDigit2 == guessDigit3)
    winnings = winnings + 1;
    
    if (lotteryDigit3 == guessDigit1
    || lotteryDigit3 == guessDigit2
    || lotteryDigit3 == guessDigit3)
    winnings = winnings + 1;
  
  //If the guess is an exact match you win ten grand.
  if (guess1 == lottery1)
    System.out.println("Exact match: you win $10,000");
  if (guess1 == lottery1)
    System.exit(1);
  
  //Gives you reward depending on the amount of matched digits.
  switch (winnings){
    case 0: System.out.println("No digits matched: you win nothing."); break;
    case 1: System.out.println("One digit matched: you win $1,000"); break;
    case 2: System.out.println("Two digits matched: you win $1,000"); break;
    case 3: System.out.println("All digits matched: you win $3,000"); break;
  }
  }
}