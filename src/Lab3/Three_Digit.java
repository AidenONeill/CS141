package Lab3;

/*initialise and delcare variable
 * use the modulus to break the number 250 into its indivual parts with a maximum of 2 variables
 *print to the screen */

public class Three_Digit

{
	public static void main(String args[])
	{
	  int num = 250, result = 0;

	  result= num/100;

	  System.out.println("The First digit is " + result);

	  result = num/50;

	  System.out.println("The Second digit is " + result);

	  result = num%10;

	  System.out.println("The Third digit is " + result);


	}
}