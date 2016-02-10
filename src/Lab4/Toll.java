package Lab4;


//declare variables using chars
// use switch statement to define type of vehicle
// print out price to screen
public class Toll
{
	public static void main(String args[])
	{
		char car = 'a', motorbike = 'b', bus = 'c', van = 'd', truck = 'e' ;
		double num1 = 2.00, num2 = 1.10, num3 = 4.25, num4 = 4.00, num5 = 6.70 ;
//value in the switch statement would have to be changed to one of the above to test

			switch(van)
			{
				case 'a': System.out.println("Car - €" + num1); break;
				case 'b': System.out.println("Motorbike - €" + num2); break;
				case 'c': System.out.println("Bus - €" + num3); break;
				case 'd': System.out.println("Van - €" + num4); break;
				case 'e': System.out.println("Truck - €" + num5); break;


			}
	}



}
