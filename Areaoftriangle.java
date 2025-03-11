package day1;

import java.util.Scanner;

public class Areaoftriangle {

	public static void main(String[] args) {
		// Program to find area of triangle
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the breadth of the triangle");
		int b=s.nextInt();
		
		System.out.println("Enter the height of the triangle");
		int h=s.nextInt();
		
		double t=0.5*b*h;
		System.out.println("The area of triangle is " +t);
		s.close();
	}

}
