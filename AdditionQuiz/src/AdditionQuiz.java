import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// Generate numbers 1 and 2
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() % 10);
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " +  number2 + "?");    // Ask question from user
		
		int answer = input.nextInt();                                       // recieve answer from user
		
		//display result
		System.out.println( number1 + " + " + number2 + " = " + answer + " is " +(number1 + number2 == answer));


	}

}
