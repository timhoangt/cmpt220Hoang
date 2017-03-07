/**
*file: Problem6_8.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 4
 * due date: February 28, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem6_8 abstract data type.
 */
 
/**
 * Problem6_8
 * 
 * This class displays a chart of several iterations 
 * of Fahrenheit and its temperature in Celsius.
 */

public class Problem6_8{
  public static void main(String[] args) {
    
    //Initializes the temperature values.
    double c1 = 40.0;
    double c2 = 39.0;
    double c3 = 32.0;
    double c4 = 31.0;
    double f1 = 120.0;
    double f2 = 110.0;
    double f3 = 40.0;
    double f4 = 30.0;
  
    //Prints the answer.
    System.out.println("Feet       Meters      |       Meters       Feet");
    System.out.println("----------------------------------------------");
    System.out.println(c1 + "       " + (celsiusToFahrenheit(c1)) + "       |       " + f1 + "       " + (fahrenheitToCelsius(f1)));
    System.out.println(c2 + "       " + (celsiusToFahrenheit(c2)) + "       |       " + f2 + "       " + (fahrenheitToCelsius(f2)));
    System.out.println("...");
    System.out.println(c3 + "        " + (celsiusToFahrenheit(c3)) + "       |       " + f3 + "       " + (fahrenheitToCelsius(f3)));
    System.out.println(c4 + "        " + (celsiusToFahrenheit(c4)) + "       |       " + f4 + "       " + (fahrenheitToCelsius(f4)));
  }
  
  public static double celsiusToFahrenheit(double celsius){
  //Converts celsius to fahrenheit and returns a value.
  double fahrenheit;
    fahrenheit = (9.0 / 5) * celsius + 32;
    fahrenheit = Math.round(fahrenheit*100)/100;
  return fahrenheit;
  }
  
  //Converts fahrenheit to celsius and returns a value.
  public static double fahrenheitToCelsius(double fahrenheit){
  double celsius;
    celsius = (5.0 / 9) * (fahrenheit - 32);
    celsius = Math.round(celsius*100)/100;
  return celsius;
  }
}