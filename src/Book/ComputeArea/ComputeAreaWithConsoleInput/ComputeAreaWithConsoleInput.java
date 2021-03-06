package Book.ComputeArea.ComputeAreaWithConsoleInput;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * @author Sorin
 * @date 2017-06-02
 * @updated 22:47
 */
public class ComputeAreaWithConsoleInput
{
	public static void main(String[] args)
	{
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();

		// Compute area
		double area = radius * radius * 3.14159;

		//Display result
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}