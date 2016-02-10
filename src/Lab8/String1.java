package Lab8;


//declare and initialise two strings
//make sure they are the same length
// print alternate letters from each string to the screen
public class String1

{
	public static void main(String args[])
	{
		String one = new String ("Hello World");
		String two = new String ("World Arrow");

		if(one.length()==two.length())
		{
			System.out.println("The Strings are the same length");
		}
		else
		{
			System.out.println("The Strings are not the same length");
		}
		for(int x=0;x<one.length();x++)
		{
			if(x%2==0)
			{
				System.out.print(one.charAt(x));

			}
			else
			{
				System.out.print(two.charAt(x));
			}


		}

	 }





}
