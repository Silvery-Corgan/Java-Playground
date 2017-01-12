public class Time
{
	public static void main(String[] args)
	{
		int hour=13, minute=57, second=30;
		int midnighth=24, midnightm=60, midnights=60;
		System.out.println("Since midnight, there have been " + (midnighth-hour) + " hours, " + (midnightm-minute) + " minutes, " + (midnights-second) + " seconds.");
	}
}