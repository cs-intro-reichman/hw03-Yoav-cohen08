//Prints the calendars of all the years in the 20th century.
public class Calendar 
{	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	 
	 //Prints the calendars of all the years in the 20th century. Also prints the  
	 //number of Sundays that occured on the first day of the month during this period. 
	public static void main(String args[]) 
	{
	    //int debugDaysCounter = 0; 
	    //int numperfectsundays = 0;
	    String str = "";
	    int choseY = Integer.parseInt(args[0]);
	 	while (year < choseY + 1) 
	 	{
	 		advance();
	 		while(year == choseY)
	 		{
	 			str = "";
	 			if(dayOfWeek == 1) str = " Sunday";
	 			System.out.println(dayOfMonth + "/" + month + "/" + year + str);
	 			//if((dayOfWeek == 1) && (dayOfMonth == 1)) numperfectsundays++;
	 			advance();
	 		}

	 		//debugDaysCounter++;	 		
        }
        //System.out.println("During the year " + choseY + ": " + numperfectsundays + " Sundays fell on the first day of the month");
        // System.out.println(debugDaysCounter);
	 }	
	 private static void advance() 
	 {
	 	if(dayOfWeek == 7) dayOfWeek = 1;
	 	else dayOfWeek++;

	 	if(dayOfMonth == nDaysInMonth) 
	 	{
	 		if(month == 12)
	 		{
	 			month = 0;
	 			year++;
	 		}
	 		dayOfMonth = 1;
	 		month++;
	 		nDaysInMonth = nDaysInMonth(month, year);
	 	}
	 	else dayOfMonth++;


	 } 
	private static boolean isLeapYear(int year) // Returns true if the given year is a leap year, false otherwise.
	{
	    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return true;
		else return false;
	}
	 
	private static int nDaysInMonth(int month, int year)//Returns number of days in month.
	{
		if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))
		{
			return 31;
		} else if((month == 4) || (month == 6) || (month == 9) || (month == 11)) return 30;
				else if(isLeapYear(year)) return 29;
						else return 28;
	}
}
