package Lab5;

// initialise and declare variable
//use a while loop to generate values between 0 and 999
// check if they are mutliples of 4
//print to the screen if they are

public class Loop2
{
	public static void main (String args[])
	{
		int x = 0;

		while(x>=0&x<1000)
		{
			x++;
		   if(x%4==0)
		   {
			 System.out.println(x+ " is a multiple of 4");
		   }


		}


	}
}