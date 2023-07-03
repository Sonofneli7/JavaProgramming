import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();     // read a double
		
		//Compute area 
		double area = radius * radius * 3.14159;
		
		// Display results
		System.out.println("The are for the circle of radius" + radius + "is" + area);

			
		
	}

}
