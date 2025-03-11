package day1;

import java.util.Scanner;

public class Circumferenceofsq {

	public static void main(String[] args) {
		// Program to find circumference of square
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of one side of square");
		int a=sc.nextInt();
		
		int c=4*a;
		System.out.println("The circumference of square is: " +c);
	    sc.close();
		

	}

}
