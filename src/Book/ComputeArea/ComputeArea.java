package Book.ComputeArea;

/**
 * Created by IntelliJ IDEA
 * @author Sorin
 * @date 2017-06-02
 * @updated 22:47
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

		//Compute different areas
		System.out.println("=================================================");

		//Compute First Area
		radius = 1.0;
		System.out.println("The area is " + area + " for radius " + radius);

		//Compute Second Area
		radius = 2.0;
		System.out.println("The area is " + area + " for radius " + radius);
	}
}