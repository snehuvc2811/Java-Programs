package day1;

import java.util.Scanner;

public class Areaofsquare {

	public static void main(String[] args) {
		// Program to find area of a square
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of s1");
		int s1=s.nextInt();
		
		System.out.println("Enter the value of s2");
		int s2=s.nextInt();
		
		int a=s1*s2;
		System.out.println("The area of a square is: " +a);
		s.close();
		

	}

}
