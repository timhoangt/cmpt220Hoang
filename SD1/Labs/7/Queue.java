/**
*file: Queue.java
 * author: Timothy Hoang
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 25, 2017
 * version: 1.8
 * 
 * This file contains the declaration of the 
 * Queue abstract data type.
 */
 
/**
 * Problem10_10
 * 
 * This class cretes a queue that holds elements and
 * releases them in a first-in first-out fashion.
 */

 
//UML diagram for the class.
/********************
 *      Queue       *
 *------------------*
 * -elements: int[] *
 * -size: int       *
 * Queue()          *
 * addQueue(q: int)  *
 * subtractQueue(): int   *
 * empty(): boolean *
 * getSize(): int   *
 ********************/

public class Queue {
  
  //Initializes the data fields.
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;

  /** Construct a queue with the default capacity 8. */
  Queue() {
    elements = new int[DEFAULT_CAPACITY];
  }

  /** Pushes a new integer to the queue. */
  public void addQueue(int q) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = q;
  }

  /** Returns and removes the next element from the queue */
  public int subtractQueue() {
    int q = elements[0];
    int[] temp = new int[elements.length];
    System.arraycopy(elements, 1, temp, 0, size);
    elements = temp;
    size--;
    return q;
  }

  /** Test whether the queue is empty. */
  public boolean empty() {
    return size == 0;
  }

  /** Returns the number of elements in the queue. */
  public int getSize() {
    return size;
  }
}