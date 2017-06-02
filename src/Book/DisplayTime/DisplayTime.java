package Book.DisplayTime;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 *
 * @author Sorin
 * @date 2017-06-02
 * @updated 23:20
 */
public class DisplayTime
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//Prompt user
		System.out.println("Enter an integer for seconds: ");
		int seconds = input.nextInt();

		//Find minutes in seconds
		int minutes = seconds / 60;

		//Seconds remaining
		int remainingSeconds = seconds % 60;

		//Print result
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
