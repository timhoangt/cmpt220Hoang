/**
 *file: Final_Grade.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 1
 * due date: January 31, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Final_Grade abstract data type.
 */
 
/**
 * Final_Grade
 * 
 * This class calculates the final weighted grade
 * of a student in this class according to
 * their percentage inputs.
 */

//Imports the Scanner.
import java.util.Scanner;

public class Final_Grade{
  public static void main(String[] args) {
    //Creates a Scanner.
  Scanner input = new Scanner(System.in);
  
  //User inputs their grades for each category.
  System.out.print("Please enter the following as a percentage...");
  System.out.print("midterm exam: ");
  double midtermExam = input.nextDouble();
  System.out.print("final exam: ");
  double finalExam = input.nextDouble();
  System.out.print("projects: ");
  double projects = input.nextDouble();
  System.out.print("homework and labs: ");
  double hwAndLabs = input.nextDouble();
  
  //Calculates the the weight of each grade.
  double midtermExamWeighted = midtermExam * 0.2;
  double finalExamWeighted = finalExam * 0.2;
  double projectsWeighted = projects * 0.2;
  double hwAndLabsWeighted = hwAndLabs * 0.4;
  
  //Calculates the final grade.
  double finalGrade = midtermExamWeighted + finalExamWeighted + projectsWeighted + hwAndLabsWeighted;
    
    // Displays the result.
    System.out.println("Your final grade is : " + finalGrade +"%");
  }
}