import java.util.Random;

public class GetRandomNumber
{
	public static int randInt(int min, int max)
	{
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public static void main(String[] args)
	{
		int a = 4;
		int b = randInt(1, 4);
		while (b == a)
		{
			b = randInt(1, 4);
		}
		if (a != b)
		{
			System.out.println("a & b = " + a + " & " + b);
		}
		else System.out.println("a is b : " + a + " | " + b);
	}
}