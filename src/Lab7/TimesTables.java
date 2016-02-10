package Lab7;

// use a loop to print of all times tables between 1 and 12
// each table should be seperated by a line of *


public class TimesTables
{
	public static void main (String args[])
	{
		for(int x=1;x<=12;x++)
		{

			System.out.println(x + " Times Tables");


			for(int y=1;y<=12;y++)
			{
				System.out.println(x+" multiplied by " + y + " = " + x*y);

			}

            	System.out.println("*****************************");
            	System.out.println();

		}



	}
}

