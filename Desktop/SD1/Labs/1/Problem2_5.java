//Imports the Scanner.
import java.util.Scanner;

public class Problem2_5{
  public static void main(String[] args) {
    //Creates a Scanner.
	Scanner input = new Scanner(System.in);
	
	//User inputs a subtotal and a gratuity rate.
	System.out.print("Enter the sutotal and a gratuity rate: ");
	double subtotal = input.nextDouble();
	double gratuityRate = input.nextDouble();
	
	//Calculates the gratuity.
	double gratuity = (gratuityRate / 100) * subtotal;
	
	//Calculates the total.
	double total = subtotal + gratuity;
    
    // Displays the result.
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
  }
}