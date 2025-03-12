package day2;

import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Palindrome String");
		String n=sc.next();
		
		String rev="";
		for(int i=n.length(); i>0; i--)
		{
			rev=rev+(n.charAt(i-1));
		}
		if(n.equals(rev))
		{
			System.out.println("The given string is a Palindrome");
		}
		else
		{
			System.out.println("The given string is not a Palindrome");
		}
		sc.close();
		}

}
