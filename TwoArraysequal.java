package day2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysequal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int rollno1[]=new int[sc.nextInt()];
		
		for(int i=0; i<rollno1.length; i++)
		{
			System.out.println("Enter the value at the index "+i);
			rollno1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of the second array");
		
		int rollno2[]=new int[sc.nextInt()];
		
		for(int i=0; i<rollno2.length; i++)
		{
			System.out.println("Enter the value at the index "+i);
			rollno2[i]=sc.nextInt();
		}
		boolean b=Arrays.equals(rollno1, rollno2);
				System.out.println(b);
		if (b==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		sc.close();

	}

}
