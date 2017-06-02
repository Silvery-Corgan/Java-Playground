package Book.ComputeAverage;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * @author Sorin
 * @date 2017-06-02
 * @updated 22:47
 */
public class ComputeAverage
{
	public static void main(String[] args)
	{
		//Create a Scanner Object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter three numbers
		System.out.println("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		//Compute Average
		double average = (num1 + num2 + num3) / 3;

		//Display Result
		System.out.println("Average of " + num1 + " " + num2 + " " + num3 + " is: " + average);
	}
}
