package Lab5;

// initialise and declare variable
//use a while loop to generate the values between 200 and 500
// find which are multiples of 5 and 7
//find which are multiples of 5 or 7
//print the results to the screen

public class Loop4
{
	public static void main (String args[])
	{
		int x = 200;

		while(x>=200&x<500)
		{

		if(x%5==0&x%7==0)
		{
			System.out.println(x+ " is a multiple of 5 and 7 " );

        }
        else if(x%5==0|x%7==0)
        {
            System.out.println(x+ " is a multiple of 5 or 7 " );
        }
        x++;


		}



	}
}