

public class ShowCurrentTime {

	public static void main(String[] args) {
		 // obtain the total millisecs since midnight 1/1/1970
		long totalMilliseconds = System.currentTimeMillis();    //read input for totalMillisecs
		
		
		// obtain the total secs since midnight 1/1/1970
		long totalSeconds = totalMilliseconds / 1000;    //read input for  totalSecs
				
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;    //convert input for current secs
		
		// obtain the total minutes 
		long totalMinutes = totalSeconds / 60 ;    //convert input for totalMins
		
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;    //convert input for current min
		

		//Compute the total hours
		long totalHours = totalMinutes / 60; 		//convert total hrs
		
		//Compute the current hour
		long currentHour = totalHours % 24; 		//convert to current hour
		
		//Display results
		System.out.println("Current Time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " GMT");


	


	}

}
