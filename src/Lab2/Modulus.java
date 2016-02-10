package Lab2;

/* Initialise and declare my variables
 find the modulus of the variables and store them in a variable of the appropriate type */


public class Modulus

{ public static void main (String args[])

//declare and initalise the variables

			{ int num1 = 12, num2 = 10, result1 = 0, result2 = 0;
				float num3 = 12.0f, num4 = 10.0f, result3 = 0.0f, result4 = 0.0f, result5 = 0.0f;

				result1 = num1%num2 ;

				System.out.println("The Modulus of the variables 12 and 10 is : " + result1) ;

				result3 = num3%num4 ;

				System.out.println("The Modulus of the variables 12.0 and 10.0 is : " + result3) ;

				result2 = num2%num1 ;

				System.out.println("The Modulus of the variables 10 and 12 is : " + result2);

				result4 = num4%num3 ;

				System.out.println("The Modulus of the variables 10.0 and 12.0 is : " + result4);

				result5 = num3%num2 ;
				System.out.println("The Modulus of the variables 12.0 and 10 is : " + result5) ;







			}


}