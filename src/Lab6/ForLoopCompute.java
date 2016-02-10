package Lab6;

//declare and initialise variables
//use a for loop with an if statement to determine the even numbers between 2 and 100
// add these together to find the total
//use a second for loop to find the sum of the squares
//print the results for the sum of the even numbers and the sum of the squares to the screen
// on seperate lines

public class ForLoopCompute
{
	public static void main (String args[])
	{
		int y = 0, z = 0, a = 0;

	for(int x=2;x<=100;x++)

       {
		if(x%2==0)
		  {
		   y=y+x;
		  }
	   }
	 for(int j=1;j<=100;j++)
	 {
	 	z=j*j;
	 	a=a+z;

	 }


	System.out.println("The sum of the even numbers is: " + y);
	System.out.println("The Sum of the squares is: " + a);
	}
}