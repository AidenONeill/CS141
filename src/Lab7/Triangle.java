package Lab7;



// use loops to find the sides of all phthagorean triangles with sides less than 200
// use if statments to sort the results
// print the relevent results to the screen


public class Triangle
{
	public static void main (String args[])
	{


	 for(int x=1;x<=200;x++)
	 {
	 	for(int y=1;y<=200;y++)
	 	{
	 		for(int z=1;z<=200;z++)


	 		if((x*x+y*y) == z*z)
	 		{
	 			System.out.println("The trangle with the sides " + x + ","  + y + " and "+ z + " are pythagorean triangles");
	 		}
	 	}

	 }
	}
}

