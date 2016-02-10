package Lab2;

/* Initialise and declare my variables
 *add a function to find the average of the variables and print to the screen
 *add function to find the sum of the variables and print to the screen
 *add functtion to find the product of the variables and print to the screen */


public class Decimal

{ public static void main (String args[])

//declare and initalise the variables
		{float num1 = 2.5f, num2 = 4.3f, num3 = 5.3f, num4 = 1.45f, num5 = 0.75f, num6 = 8.3f ;
		 float result1 = 0.0f, result2 = 0.0f, result3 = 0.0f;
		 int avg = 6 ;
//function to find the average of the variables
			result1 = num1+num2+num3+num4+num5+num6 ;
	    	result2 =result1/avg ;

	   		System.out.println("The Average of the numbers is: " + result2) ;

//function to find the sum of the variables

				System.out.println("The Sum of the numbers is: " + result1);

//function to find the product of the variables

					result3 = num1*num2*num3*num4*num5*num6 ;

					System.out.println("The Product of the numbers is: " + result3);









		}

}


