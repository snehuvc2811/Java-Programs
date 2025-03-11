package day1;

import java.util.Scanner;

public class Circumferenceoftriangle {

	public static void main(String[] args) {
		// Program to find circumference of triangle
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		
		System.out.println("Enter the value of c");
		int c=s.nextInt();
		
		int d=a+b+c;
		System.out.println("The circumference of triangle is :" +d);
		s.close();

	}

}
