import java.util.Scanner;


public class ComputeLoan {					//importing class

	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter annual interest rate in percentage, example: 7.25
		System.out.print("Enter annual interest rate in percentage, example: 7.25 ");	//prompt user for interest amt
		double annualInterestRate = input.nextDouble();									//read amount entered
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;	
		
		// Enter number of years
		System.out.print("Enter number of years as a integer, example 5:  ");
		int numberOfYears = input.nextInt();  						//Reading number of years entered
		
		//Enter Loan amount
		System.out.print("Enter loan amount, example, 120000.95:  ");
		double loanAmount = input.nextDouble();					// enter and read loan amount
		
		//Calc pymt
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));      // converting monthly pymt
		double totalPayment = monthlyPayment * numberOfYears * 12;					//total payment
		
		//Display Results
		
		System.out.println("The monthly payment is $ " + (int)(monthlyPayment * 100) / 100.0 );
		System.out.println("The total payment is $ " + (int)(totalPayment * 100) / 100.0 );



	}

}
