import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		
		if (number  % 5 == 0)								// Check if an integer of 5
			System.out.println("HiFive");
		
		if (number  % 2 == 0)								// Check if an integer of 2
			System.out.println("HiEven");

	}

}
