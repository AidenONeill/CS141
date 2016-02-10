package Lab4;

//declare a  variable
// discover if it is 3 or 4 digits in length
// depending on the length print appropriate lines to the screen for each digit

public class ThreeOrFour
{
	public static void main(String args[])
  {
	 int num1 = 587 ,num2 = 0, num3 = 0, num4 = 0, result = 0, result1 = 0, result2 = 0, result3 = 0;

	 if(num1>=1000)
	 {
	 	result  = num1%10 ;
	   	num2 = num1/10 ;
	   	result1 = num2%10 ;
	   	num3 = num2/10 ;
	   	result2 = num3%10 ;
	   	num4 = num3/10 ;
	   	result3 = num4%10;

	   	System.out.println(result3);
	   	System.out.println(result2);
	   	System.out.println(result1);
	   	System.out.println(result);
	 }
	  else if(num1<=999)
	   {
	   	result  = num1%10 ;
	   	num2 = num1/10 ;
	   	result1 = num2%10 ;
	   	num3 = num2/10 ;
	   	result2 = num3%10 ;

	    System.out.println(result2);
	   	System.out.println(result1);
	   	System.out.println(result);

	   }



	}


}




