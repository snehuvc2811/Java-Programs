package day2;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");
		int i=sc.nextInt();
		System.out.println("Enter Denominator");
		int j=sc.nextInt();
		int result = 0;
		try 
		{
		result=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(result);
		sc.close();
	}

}
