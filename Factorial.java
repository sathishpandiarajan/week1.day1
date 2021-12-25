package week1.day1.classroom;

import java.util.Iterator;

public class Factorial 
{

	public static void main(String[] args) 
	{
		int i = 1, num = 5, fact =1;
		for (i=1;i<=num;i++)	
		{
			fact = fact * i;
		}
		System.out.println("Factorial for the number is: " +fact);
	}
}

