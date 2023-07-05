import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		// number of questions
		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0; 								//  count the correct number of answers
		int count = 0;										// count the number of questions
		long startTime = System.currentTimeMillis();
		String output =" ";          						// output string is initially empty
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS) {
		// 1. Generate two rando single-digit integers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		// 2. if number1 < number2, swap number1 with number 2
		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// 3. Prompt student to answer "What is number1 - number2?"
		System.out.print(" What is " + number1 + " - " + number2 + "? ");							//displaying a question
		int answer = input.nextInt();
		
		// 4. Grade the answer and display the result
		if (number1 - number2 == answer) {
			System.out.println("You are correct!");
			correctCount++;                 								//increase by 1 the correct answer count
		}
		else
			System.out.print("Your answer is wrong.\n " + number1 + " - " + number2 + " should be " + (number1 - number2));
		
		// Increase the question count
		count++;																// increase control variable
		
		output+="\n"  + number1 + " - " + number2 + " = " + answer +((number1 - number2 == answer)			// prepare output
			? " correct": " wrong");															
		
		}																						// ends the loop
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;													// get end time and test time
		
		// Display result
		
		System.out.print("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n " + output);

	
		
		
		
			
			
		
	}
}
