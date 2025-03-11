package day1;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		//Program to find area of a circle
		
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter the value of r: ");
		 int r=s.nextInt();
		 
		 System.out.println("Enter the value of pi: ");
		 double pi=s.nextDouble();
		 
		 double c=pi*r*r;
		 System.out.println("Area of Circle is:");
		 System.out.println(c);
		 s.close();
	}

}
