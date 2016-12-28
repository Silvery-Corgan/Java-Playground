public class Hello
{

	public static void main(String[] args)
	{
		String message, firstName, lastName;
		int hour, minute;

		// generate some simple output
		System.out.println("Hello, World!");                // first line
		System.out.println("How are you?");                 // another line
		System.out.print("Goodbye, ");                      // this is a print statement that doesn't add up a new line
		System.out.println("cruel world");                  // this one adds up a new line after concatenating it with the previous string
		System.out.print("Hello!\nHow are you doing?\n");   // add new line manually
		System.out.println("She said \"Hello!\" to me.");   // add quotation marks
		System.out.println("What's up doc?");               // add new statement

		message = "Hello!";  // give message the value "Hello!"
		hour = 11;           // assign the value 11 to hour
		minute = 59;         // set minute to 59
	}
}