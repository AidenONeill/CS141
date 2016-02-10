package Lab7;

// use a for loop to print a rectangle of stars to the screen
// use an if statement to determine what is printed to each line
// print the rectangle to the screen


public class StarRect
{
	public static void main (String args[])
	{
		int num=23;

		for(int x=1;x<=num;x++)
		{
			if(x==1|x==num)
			{
			   System.out.println("**********");
			}
			else
			{
			  	System.out.println("*        *");
			}







		}


	}
}

