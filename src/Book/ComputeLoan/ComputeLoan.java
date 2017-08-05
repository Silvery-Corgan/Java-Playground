package Book.ComputeLoan;

/* This program must satisfy the below:
- It must let the user enter the interest rate, loan amount, number of years for which the payments will be made
- It must compute and display the monthly payment and total payment amounts
 */

import java.util.Scanner;

public class ComputeLoan
{
	public static void main(String[] args)
	{
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate (ex. 7.25%
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();

		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Enter number of years, ex. 5
		System.out.print("Enter number of years as integer: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount, ex. 120000.95
		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();

		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		// Display Results
		System.out.println("\nThe monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
	}
}