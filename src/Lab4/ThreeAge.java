package Lab4;

//declare variables to indicate ages of three different people
//use an if statement and boolean operators to check the ages
//print a message to the screen depending on the result

public class ThreeAge
{
	public static void main(String args[])
	{
	 int num1 = 14, num2 = 19, num3 = 22 ;

	 if(num1>=18&num2>=18&num3>=18)
	 {
	 	System.out.println("All people are over 18");
	 }
	 else
	 {
	 	System.out.println("Not all people are over 18");
	 }
	 if(num1>=18|num2>=18|num3>=18)
	 {
	 	System.out.println("At least one people is over 18");
	 }



	}



}
