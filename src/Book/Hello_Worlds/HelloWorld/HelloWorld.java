package Book.Hello_Worlds.HelloWorld; /**
 * This is a ... peculiar ... "Book.Hello_Worlds.Hello.Hello.Book.Hello_Worlds.Hello.Hello World" Example
 */

import java.util.Random;

public class HelloWorld
{
	public static void main(String... args)
	{
		System.out.println(randomString(-229985452) + ' ' + randomString(-147909649));
	}

	public static String randomString(int seed)
	{
		Random rand = new Random(seed);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; ; i++)
		{
			int n = rand.nextInt(27);
			if (n == 0) break;
			sb.append((char) ('`' + n));
		}
		return sb.toString();
	}
}