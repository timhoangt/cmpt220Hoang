/**
*file: Problem10_10.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Problem10_10 abstract data type.
 */
 
/**
 * Problem10_10
 * 
 * This class invokes Queue.java and adds the numbers
 * 1 through 20 to the queue and then subtracts and
 * displays the numbers in the queue.
 */

public class Problem10_10 {
  public static void main(String[] args) {
    //Creates a Queue object.
    Queue queue = new Queue();

    //Adds numbers 1 to 20 into the queue.
    for (int i = 1; i <= 20; i++) {
      queue.addQueue(i);
    }

    //Removes and displays numbers.
    while (!queue.empty()) {
      System.out.print(queue.subtractQueue() + " ");
    }
    
    System.out.println();
  }
}