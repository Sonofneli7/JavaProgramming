import java.util.Scanner;    //Scanner from util pkg


public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		Double fahrenheit = input.nextDouble();      //reading input
		
		//Convert Fahrenheit to Celsius
		double celsius =(5.0 / 9) *  (fahrenheit - 32);      //conversion equation
		System.out.println("Fahrenheit " + fahrenheit + " is  " + celsius + " in Celsuis");

		
		

	}

}
