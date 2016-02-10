package Lab9;

// created a scanner to ask a user for two integer inputs
// store the variables entered
// raise the first number to the power of the second number
import java.util.Scanner;

public class ScannerPower
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first number");
		double num1 =sc.nextInt();
		System.out.println("Please Enter the second number");
		double num2 =sc.nextInt();
		double num3 = Math.pow(num1,num2);

		System.out.println(num1 + " raised to the power of " + num2 + " = " + num3 );



	}
}