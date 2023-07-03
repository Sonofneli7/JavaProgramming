import java.util.Scanner;    //Scanner from util pkg

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);      // create scanner
		
		//prompt user for input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();             //read an integer
		
		int minutes = seconds / 60;   // find mins in secs
		int remainingSeconds = seconds % 60;     // divide remainder to find secs remaining
		
		//Display results
		System.out.println( seconds + " seconds is " + minutes + "minutes and " + remainingSeconds + " seconds");

		

	}

}

