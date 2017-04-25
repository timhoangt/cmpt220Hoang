/**
*file: Problem9_1.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 6
 * due date: April 18, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem9_1 abstract data type.
 */
 
/**
 * Problem9_1
 * 
 * This class get the width, height, area, and perimeter of two rectangles
 * while referencing the rectangle object class.
 */
 
public class Problem9_1{
  public static void main(String[] args) {
    
    //Creates a new rectangle with width of 4 and height of 40.
    Rectangle rectangle1 = new Rectangle(4, 40);
    
    //Prints the values referencing the rectangle object class.
    System.out.println("The width of the first rectangle is " + rectangle1.width + ".");
    System.out.println("The height of the first rectangle is " + rectangle1.height + ".");
    System.out.println("The area of the first rectangle is " + rectangle1.getArea() + ".");
    System.out.println("The perimeter of the first rectangle is " + rectangle1.getPerimeter() + ".");
    
    //Creates a new rectangle with width of 3.5 and height of 35.5.
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    
    //Prints the values referencing the rectangle object class.
    System.out.println("The width of the second rectangle is " + rectangle2.width + ".");
    System.out.println("The height of the second rectangle is " + rectangle2.height + ".");
    System.out.println("The area of the second rectangle is " + rectangle2.getArea() + ".");
    System.out.println("The perimeter of the second rectangle is " + rectangle2.getPerimeter() + ".");
  } 
}

class Rectangle {
    
  //Default values for data fields length and width.
  double width = 1;
  double height = 1;
    
  //Default constructor of rectangle object.
  Rectangle() {
  }
  
  //Constructor for getting new values for width and height.
  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }
  
  //Returns the area of the rectangle.
  double getArea() {
    return width * height;
  }
  //Returns the perimeter of the rectangle.
  double getPerimeter() {
    return width * 2 + height * 2;
  }    
}