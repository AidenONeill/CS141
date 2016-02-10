package Lab8;

 //declare and initialise a string
 //use a loop to cycle through the string
 //print each word to the screen in reverse order


 public class String4

{
	public static void main(String args[])
	{
		String one = new String ("My Name is Ashling");
		int y=one.length();

		for(int x=one.length()-1;x>=0;x--)
		{
			if(one.charAt(x)==' '|x==0)
			{
				System.out.println(one.substring(x, y));
				y=x;


			}
		}




	}

}
