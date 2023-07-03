import java.util.Scanner;    //Scanner from util pkg

public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		final double PI = 3.14159;      // declaring a constant
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Compute Area
		double area = radius * radius * PI;
	
		
		//Display result
		System.out.println("The area for the circle of radius" + radius + " is " + area);
	

	}

}
