package Book.DisplayTime;

// Epoch time is Midnight 1970/01/01

public class ShowCurrentTime
{
	public static void main(String[] args)
	{
		// Obtain total miliseconds since Epoch
		long totalMiliseconds = System.currentTimeMillis();

		// Obtain the total number of seconds since Epoch
		long totalSeconds = totalMiliseconds / 1000;

		// Compute the current seconds in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;

		System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
}
