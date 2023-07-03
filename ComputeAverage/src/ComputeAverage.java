import java.io.InputStream;
import java.util.Scanner;    //Scanner from util pkg

public class ComputeAverage {

	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter 3 numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();    //read doubles from prompt
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute Average
		double average = (number1 + number2 + number3) / 3;
		
		// Display results
		System.out.println("The average of " + number1 + "" + number2 + "" + number3 + "is" + average);
		

	}

}
