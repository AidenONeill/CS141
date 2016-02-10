package Lab3;


/*initialise and delcare variables
 * use the modulus to break the number 2787 into its indivual parts
 * Print to the screen using at most one print statement */

public class Four_Digit

{
	public static void main(String args[])
	{
	 int num1 = 2787, num2 = 0, num3 = 0, num4 = 0;
	 int result = 0, result1 = 0, result2 = 0, result3 = 0;

	 	result  = num1%10 ;
	   	num2 = num1/10 ;
	   	result1 = num2%10 ;
	   	num3 = num2/10 ;
	   	result2 = num3%10 ;
	   	num4 = num3/10 ;
	   	result3 = num4%10;

	 	System.out.println("The digits in the four digit number 2787 are: \n"+result3+"\n"+result2+"\n"+result1+"\n"+result) ;



	}
}