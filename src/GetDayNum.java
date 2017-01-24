import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetDayNum
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		DayOfWeek dow = date.getDayOfWeek();
		System.out.println("Enum = " + dow);

		String dayName = dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
		System.out.println("FULL = " + dayName);

		dayName = dow.getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
		System.out.println("FULL_STANDALONE = " + dayName);

		dayName = dow.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
		System.out.println("NARROW = " + dayName);

		dayName = dow.getDisplayName(TextStyle.NARROW_STANDALONE, Locale.ENGLISH);
		System.out.println("NARROW_STANDALONE = " + dayName);

		dayName = dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		System.out.println("SHORT = " + dayName);

		dayName = dow.getDisplayName(TextStyle.SHORT_STANDALONE, Locale.ENGLISH);
		System.out.println("SHORT_STANDALONE = " + dayName);
	}
}
