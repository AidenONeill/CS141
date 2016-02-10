package Lab4;

//declare variables using doubles
// use an if statement to check for a character variable
// perform a specific maths operation depending on the variable store in char
// print the result to the screen

public class MathOperation
{
	public static void main(String args[])
	{
	 double num1 = 45.34, num2 = 65.7 ;
	 char oper = '*';

	 if(oper=='*')
	 {
	 	System.out.println(num1*num2);
	 }
	 else if(oper=='/')
	 {
	 	System.out.println(num1/num2);
	 }
	 else if(oper=='+')
	 {
	 	System.out.println(num1+num2);
	 }
	 else if(oper=='-')
	 {
	 	System.out.println(num1-num2);
	 }
	 else if(oper=='%')
	 {
	 	System.out.println(num1%num2);
	 }
	 else
	 {
	 	System.out.println("Not a valid option");
	 }




	}



}
