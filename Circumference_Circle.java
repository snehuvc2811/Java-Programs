package day1;

import java.util.Scanner;

public class Circumference_Circle {

	public static void main(String[] args) {
		//Program to find Circumference of a circle
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of r: ");
		int r=s.nextInt();
		 
		System.out.println("Enter the value of pi: ");
		double pi=s.nextDouble();
		
		double c=2*pi*r*r;
		System.out.println("The circumference of circle is " +c);
		s.close();
		
	}

}
