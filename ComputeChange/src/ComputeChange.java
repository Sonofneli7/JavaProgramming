import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner (System.in);
		
		//Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");				//enter input
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars	
		int numberOfOneDollars = remainingAmount / 100;					// conversion to dollars
		remainingAmount = remainingAmount % 100;
		
		//Find number of quarters in remaining amount
		int numberOfQuarters = remainingAmount / 25;					// conversion to quarters
		remainingAmount = remainingAmount % 25;
		
		//Find number of dimes in remaining amount
		int numberOfDimes = remainingAmount / 10;					// conversion to dimes
		remainingAmount = remainingAmount % 10;
		
		//Find number of nickels in remaining amount
		int numberOfNickels = remainingAmount / 5;					// conversion to nickels
		remainingAmount = remainingAmount % 5;
				
		//Find number of pennies in remaining amount
		int numberOfPennies = remainingAmount;					// conversion to pennies
		
		
		//Display Results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("  " + numberOfOneDollars + " dollars");
		System.out.println("  " + numberOfQuarters + " quarters");
		System.out.println("  " + numberOfDimes+ " dimes");	
		System.out.println("  " + numberOfNickels + " nickels");
		System.out.println("  " + numberOfPennies + " pennies");
		

	}

}
