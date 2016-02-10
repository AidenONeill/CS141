package Lab5;

// initialise and declare variable
//use a while loop to generatethe odd values between 0 and 50
// add them together
//print result to the screen

public class Loop3
{
	public static void main (String args[])
	{
		int x = 0, y=0;

		while(x>=0&x<50)
		{
			x++;
		if(x%2==1)
		{
			y=y+x;

        }


		}
		 System.out.println("The sum of the odd numbers from 0 to 50 inclusive is: "+y);


	}
}