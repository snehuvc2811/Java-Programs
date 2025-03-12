package day2;

import java.util.Scanner;

public class AcceptArrvalueRT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of your array");
	    int[] age=new int[sc.nextInt()];
	    
	    for(int i=0; i<age.length; i++)
	    {
	    	System.out.println("Please enter the value at index position"+i);
	    	age[i]= sc.nextInt();
	    }
	}

}
