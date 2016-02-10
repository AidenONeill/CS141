package Lab5;



// initialise and declare variable
//use a while loop to find the digits of any number
//print those numbers on seperate lines

public class Loop5
{
	public static void main (String args[])
	{
		int x=45874; boolean yflag=true;

		while(yflag==true)
		{


			System.out.println(x%10);
			x=x/10;

			if(x==0)
			{
			 yflag = false;
			}




		}








	}
}