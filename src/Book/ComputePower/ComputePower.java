package Book.ComputePower;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 *
 * @author Sorin
 * @date 2017-06-02
 * @updated 23:26
 * Suppose m and r are integers. Write a Java expression for mr2 to obtain a floatingpoint result.
 */
public class ComputePower
{
	public static void main(String[] args)
	{
		System.out.println(0B1111); // Displays 15
		System.out.println(07777); // Displays 4095
		System.out.println(0XFFFF); // Displays 65535
		System.out.println("1.0 / 3.0 is " + 1.0 / 3.0); // 16 digits
		System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F); // 8 digits
		int m, r;
		Scanner input = new Scanner(System.in);
		System.out.println("Give base: ");
		m = input.nextInt();
		System.out.println("Give exponent: ");
		r = input.nextInt();
		double power = Math.pow(m, r);
		System.out.println(m + " to the power of " + r + " is: " + power);
	}
}
