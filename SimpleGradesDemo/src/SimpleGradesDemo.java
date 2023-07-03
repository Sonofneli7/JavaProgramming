import java.util.Scanner;

public class SimpleGradesDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an grade score: ");
		int score = input.nextInt();
		
		//nested if/else statements
		if (score >= 90)								// Check if score greater than 90
			System.out.println("A");
		
		else if (score >= 80)								// Check if score greater than 80
			System.out.println("B");

		else if (score >= 70)								// Check if score greater than 70
			System.out.println("C");

		else if (score >= 60)								// Check if score greater than 60
			System.out.println("D");
		
		else 
			System.out.println("F");						// Anything lower of score outputs F


	}

}
