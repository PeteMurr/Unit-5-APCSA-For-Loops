//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 


public class MultTable
{
	private int number;
	private int stop;

	public MultTable(int n, int s)
	{
		n = number;
		s = stop;
		
	}

	public void printTable( )
	{
		for ( int placeholder = 1; placeholder <= stop; placeholder++ )
		{
			System.out.println( placeholder + "     " + (number * placeholder )  );
		}
	}
}
}
