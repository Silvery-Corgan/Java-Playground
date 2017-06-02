package Book.ComputeArea;

/**
 * Created by Sorin on 2017-06-02.
 */
public class ComputeArea
{
	public static void main(String[] args)
	{
		//Declare vars
		double radius, area;

		//Assign radius
		radius = 20;

		// Step 2: Compute area
		area = radius * radius * 3.14159;

		// Step 3: Display the result
		System.out.println("Area for circle or radius " + radius + " is " + area);
	}
}