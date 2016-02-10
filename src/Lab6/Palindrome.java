package Lab6;

//declare and initialise variables
//write a program to find all palidrome 4 digit numbers
//print these numbers to the screen
//using if statments within a for loops and making use of the modulus
public class Palindrome
{
	public static void main (String args[])
   {

      int first = 0, second = 0, third = 0;

	 for(int x=1000;x<10000;x++)
	 {
	 	third = x/10;
	 	second = third/10;
	 	first = second/10;

	 	if(first==x%10&second%10==third%10)
	 	{
	 		System.out.println(x);
	 	}


	}
  }


}