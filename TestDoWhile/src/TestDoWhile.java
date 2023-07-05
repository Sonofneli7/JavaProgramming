import java.util.Scanner;

public class TestDoWhile {

//	main method
	public static void main(String[] args) {
		int data;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
	
//		keep reading data until input is 0
		do {
			// Read the next data
			System.out.print("Enter an integer (the input ends if it is 0): ") ;
			data = input.nextInt();
			sum += data;
		} while (data != 0 );
		
//		display result
		System.out.println("The sum is " + sum);
	}

}
