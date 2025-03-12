/*WAP to count no of alphabets, digits, space and special characters 
in a given string*/

package day2;

import java.util.Arrays;

public class CountNoofADSS {

	public static void main(String[] args) {
		
	    int count_of_alphabets=0;
	    int count_of_digits=0;
	    int count_of_whitespaces=0;
	    
		
	    String name= "sneha 123 ##";
		char c1[]=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0; i<+c1.length-1;i++)
		{
		boolean b1=Character.isAlphabetic(c1[i]);
		boolean b2=Character.isDigit(c1[i]);
		boolean b3=Character.isWhitespace(c1[i]);
		
		if(b1==true)
		{
		  count_of_alphabets++;
		}
		if(b2==true)
		{
			count_of_digits++;
		}
		if(b3==true)
		{
			count_of_whitespaces++;
		}
		}
		
		System.out.println(count_of_alphabets);
		System.out.println(count_of_digits);
		System.out.println(count_of_whitespaces);
		
		int countofspecialchar=name.length()-(count_of_alphabets+count_of_digits+count_of_whitespaces);
		System.out.println(countofspecialchar);
	}
	}


