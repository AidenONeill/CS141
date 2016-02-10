package Lab6;



//declare and initialise variables
//write a program to break down the digits of every three digit number
// print each difit to the screen
//print these to the screen seperated by a row of stars

public class ThreeDigitStars
{
	public static void main (String args[])
	{

	  int y = 0, z = 0;

	 for(int x=100;x<1000;x++)
	 {
	 	y=x/10;
	 	z=y/10;

	 	 System.out.println(" The first digit of " + x + " is: " + z%10);
		 System.out.println(" The Second digit of " + x + " is: " + y%10);
		 System.out.println(" The Third digit of " + x + " is: " + x%10);
		 System.out.println("**************************************");

	 }











	}
}