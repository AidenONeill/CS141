package Lab8;

 //declare and initialise a strign with three words
 //cound hte numbers of the character a in the string
 //replace the char a with another depending on the number of occurence


 public class String2

{
	public static void main(String args[])
	{

		String one = new String ("all the animals");
		int y = 0;

		for(int x=0;x<one.length();x++)
		{
			if(one.charAt(x)=='a')
			{
				y=y+1;
         	}

		}
		if(y>=3)
		{
			String newone=one.replace('a','s');
			System.out.println(newone);

		}
		else
		{
		    String newtwo=one.replace('a','%');
			System.out.println(newtwo);
		}



	}





}
