package Other.BPNRandQ;

import java.util.Random;

public class BPNRandQ
{
	public static int randInt(int min, int max)
	{
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public static String question(int qNumber)
	{
		String question1 = "What is your joining date?<br>Please use the format DD-Month-YY / 1-Jan-17";
		String question2 = "What is your date of birth?<br>Please use the format DD-Month-YY / 1-Jan-17";
		String question3 = "What is your postal code?";
		String question4 = "What is your national ID number?";

		switch (qNumber)
		{
			case 1:
				return question1;
			case 2:
				return question2;
			case 3:
				return question3;
			case 4:
				return question4;
		}
		return "Error";
	}

	public static void main(String[] args)
	{
		int a = randInt(1, 4); //execution.getVariable("questionRand1")
		int b = randInt(1, 4);
		while (b == a)
		{
			b = randInt(1, 4);
		}
		if (b != a)
		{
			System.out.println(question(a) + " + " + question(b)); //execution.setVariable("questionRand2", b);
		}
	}
}