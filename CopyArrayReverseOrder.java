package day2;

import java.util.Arrays;

public class CopyArrayReverseOrder {

	public static void main(String[] args) {
		int name1[]=new int[4];
		name1[0]= 44;
		name1[1]= 22;
		name1[2]= 34;
		name1[3]= 62;
		
		int reverse[]=new int[name1.length];
		
		for(int i=0, j=3; i<name1.length; i++)
		{
			reverse[j]= name1[i];
			j--;
		}
		System.out.println("Input Array-->" +Arrays.toString(name1));
		System.out.println("Reversed Array-->" +Arrays.toString(reverse));
	}

}
