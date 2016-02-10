package Lab8;

 //declare and initialise a strign
 //use a loop to cycle through the string backwards
 //print it to the screen


 public class String3

{
	public static void main(String args[])
	{
		String one = new String ("My Name is Ashling");

		for(int x=one.length()-1;x>=0;x--)
		{
			System.out.print(one.charAt(x));
		}

	}

}
