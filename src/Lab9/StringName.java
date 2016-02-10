package Lab9;

// created a scanner to ask a user for their name
// store it using a string
//print it to the screen, one letter per line
import java.util.Scanner;

public class StringName
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Name");
		String name = sc.nextLine();

		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}


	}
}