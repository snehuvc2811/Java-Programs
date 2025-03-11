package day1;

import java.util.Scanner;

public class Areaofrectangle {

	public static void main(String[] args) {
		// Program to find the area of a rectangle
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int l=s.nextInt();
		
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		
		int c=l*b;
		System.out.println("The area of rectangle is: " +c);
		s.close();
		

	}

}
