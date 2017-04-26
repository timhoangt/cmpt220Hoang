/**
*file: UseBMIClass.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * UseBMIClass abstract data type.
 */
 
/**
 * Problem10_2
 * 
 * This class uses the BMI class.
 * I have added my own information taking advantage of the new
 * constructor where you can have the height in feet and inches.
 */

public class UseBMIClass {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " " + bmi1.getStatus());

    BMI bmi2 = new BMI("Susan King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " " + bmi2.getStatus());
      
    BMI bmi3 = new BMI("Timothy Hoang (new constructor)", 19, 160, 5, 11);
    System.out.println("The BMI for " + bmi3.getName() + " is "
      + bmi3.getBMI() + " " + bmi3.getStatus());
  }
}