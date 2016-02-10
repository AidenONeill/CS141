package Lab8;

 //declare and initialise a string
 //use a loop to cycle through the string
 // check if the word is lowercase
 //cpaitialise each first letter
 //print it to the screen


 public class String5

{
	public static void main(String args[])
	{
		String one = new String ("My Name is Ashling");
		String two = one.toLowerCase();

		for(int x=0-1;x<two.length();x++)
		{
			if(two.charAt(x)==' ')
			{
				int y = x+1;
				two.toUpperCase();
				System.out.println(two);


			}

		}

	}

}


