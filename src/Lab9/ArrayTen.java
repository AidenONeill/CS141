package Lab9;



// created an array of size 10
// store 10 random variables less than 1000
// Print them to the screen
// Find the average of the numbers
import java.util.Random;

public class ArrayTen
{
	public static void main (String args[])
	{
		int ar[] = new int[10];
		Random r = new Random(1000);
		int j = 0;

		for(int i=0;i<ar.length;i++)
		{
			ar[i] = r.nextInt(1000);
			System.out.println(ar[i]);
			j = j+ar[i];

		}
		System.out.println("The average is " + j/ar.length);







	}

}
