package Book.ComputeAreaWithConstant;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 *
 * @author Sorin
 * @date 2017-06-02
 * @updated 23:02
 */
public class ComputeAreaWithConstant
{
	public static void main(String[] args)
	{
		//Declare a constant
		final double PI = 3.14159;

		//Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt user for radius
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();

		//Compute area
		double area = radius * radius * PI;

		//Display result
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}