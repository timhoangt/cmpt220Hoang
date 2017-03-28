/**
*file: Driver_prj1.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Project 1
 * due date: March 28, 2017
 * version: 1.8
 */
 
/**
 * Project 1
 * 
 * This class uses convolution to refine two matrices.
 */

//Import the Scanner.
import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // write your code here
    
    //Reads the size of the matrices according to user input.
    int i = input.nextInt();
    int j = input.nextInt();
    
    //Set the size of the matrices.
    double[] aFirst = new double[i];
    double[] aSecond = new double[j];
    
    //Records the contents of each matrix according to user input.
    for (int z = 0; z < i; z++){
      aFirst[z] = input.nextDouble();
    }
    for (int z = 0; z < j; z++){
      aSecond[z] = input.nextDouble();
    }
    
    //Gets the convolved matrix from convolveVectors.
    double[] aThird = convolveVectors(aFirst, aSecond);
    
    //Prints the answer.
    for (int count = 0; count < aThird.length - 1; count++) {
      System.out.printf("%d ", new Object[] { Long.valueOf(Math.round(aThird[count])) });
    }
    System.out.printf("%d\n", new Object[] { Long.valueOf(Math.round(aThird[(aThird.length - 1)])) });
  }
  
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    
    double[] vResult = new double[vFirst.length + vSecond.length - 1];
    // write your code here
    
    //Convolves the vecotrs given in the matrices.
    for (int i = 0; i < vResult.length; i++){
      vResult[i] = 0.0D;
      for (int j = 0; j < vSecond.length; j++) {
        if ((i - j >= 0) && (i - j < vFirst.length)) {
          vResult[i] += vFirst[(i - j)] * vSecond[j];
        }
      }
    }
    //Returns the third matrix.
    return vResult;
  }
}