package day1;

import java.util.Scanner;

public class Circumferenceofrect {

	public static void main(String[] args) {
		// Program to find circumference of rectangle
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of l");
		int l=s.nextInt();
		
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		
		int c= 2*(l+b);
		System.out.println("The circumference of rectangle is:" +c);
		s.close();
		
	}

}
