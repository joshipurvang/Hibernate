package prg;
/*A leap year in the Gregorian calendar has an extra day for February.
 *A leap year has 366 days.
 *
 * Algorithm to find a leap year
 * -------------------------------
 *  if year % 400 = 0, leap year
 *  else if year % 100 = 0, not a leap year
 *  else if year % 4 = 0, leap year
 *  else, not a leap year
 */
public class LeapYearCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
        //year we want to check
        int year = 2004;
       
        //if year is divisible by 4, it is a leap year
       
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                System.out.println("Year " + year + " is a leap year");
        else
                System.out.println("Year " + year + " is not a leap year");
}

}
