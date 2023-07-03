import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);     //create new scanner object
		
		System.out.print("Enter purchase amount: ");	//prompt user for amt
		double purchaseAmount = input.nextDouble();		//scanner reads input
		
		double tax = purchaseAmount * 0.06;				// conversion equation
		
		//Display result

		System.out.println("Sales tax is $ " + (int)(tax * 1000) / 100.0 );

	}

}
