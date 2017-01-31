//Imports the Scanner.
import java.util.Scanner;

public class Problem2_6{
  public static void main(String[] args) {
    //Creates a Scanner.
	Scanner input = new Scanner(System.in);
	
	//User inputs an Integer between 0 and 1000.
	System.out.print("Enter an integer between 0 and 1000: ");
	int firstInteger = input.nextInt();
	
	//Calculates the first digit (ones place).
	int ones = firstInteger % 10;
	
	//Clears the first digit (ones place).
	secondInteger = firstInteger / 10;
	
	//Calculates the second digit (tens place).
	int tens = secondInteger % 10;
	
	//Clears the second digit (tens place).
	thirdInteger = secondInteger / 10;
	
	//Calculates the third digit (hundreds place).
	int hundreds = thirdInteger % 10;
	
	//Calculates the sum with the previously recieved digits.
	int sum = ones + tens + hundreds;
    
    // Displays the result.
    System.out.println("The sum of the digits is " + sum);
  }
}