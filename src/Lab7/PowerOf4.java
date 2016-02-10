package Lab7;

// math.pow to get the every number between 1 and 1000 to the 4th power
// print this data to the screen


public class PowerOf4
{
	public static void main (String args[])
	{
		for(int x=1;x<=1000;x++)
		{
			System.out.println(x + " to the fourth power is "+ Math.pow(x,4));
		}

	}
}

