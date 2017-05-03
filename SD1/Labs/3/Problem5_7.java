/**
 *file: Problem5_7.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 21, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem5_7 abstract data type.
 */
 
/**
 * Problem5_7
 * 
 * This class computes what the tuition of a $10,000 a year school if it
 * increases by 5% every year in ten years and then computes the total
 * cost of four years' worth of school after the tenth year.
 */

public class Problem5_7{
  public static void main(String[] args) {
    //Declares the variables.
    double tuition = 10000;
    double cost = 0;
    int i;
    int o;
  
    //Finds and prints the tuition in ten years.
    for (i = 0; i < 11; i++){
      tuition = tuition * 1.05;
    }
  
    System.out.println("The tuition in 10 years is " + (Math.round(tuition)));
  
    //Find the tuition for four years after the ten years and adds them together.
    for (o = 0; o < 5; o++){
      tuition = tuition * 1.05;
      cost = tuition + cost;
    }
  
    //Prints out the cost of four years' tuition after ten years.
    System.out.println("The cost of four years' worth of tuition after the tenth year is " + (Math.round(cost)));
  }
}