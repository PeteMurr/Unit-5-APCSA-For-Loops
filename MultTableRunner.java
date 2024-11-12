//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import java.util.Scanner;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("enter a number");
		int value = keyboard.nextInt();
		System.out.print("enter another number");
		int times = keyboard.nextInt();
		MultTable Multvar = new MultTable(value, times);
		Multvar.printTable();
		
	}
}
