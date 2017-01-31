//Imports the Scanner.
import java.util.Scanner;

public class Problem2_1{
  public static void main(String[] args) {
    //Creates a Scanner.
	Scanner input = new Scanner(System.in);
	
	//User inputs the degree in Celsius.
	System.out.print("Enter a degree in Celsius: ");
	double celsius = input.nextDouble();
	
	//Calculates Fahrenheit fom the input.
	double fahrenheit = (9.0/5) * celsius + 32;
    
    // Displays the result.
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}