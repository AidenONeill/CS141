package Lab3;


/*initialise and delcare a variable
 * determine if the variable is even or odd
 *print to the screen depending on the result */

public class EvenOdd

{
	public static void main(String args[])
	{

	int num = 566, result = 0;

	result= num%2;

	if(result==0)
	{
		System.out.println("The number " + num +" is even");
	}
	else
	{
		System.out.println("The number " + num +" is odd");
	}


	}
}