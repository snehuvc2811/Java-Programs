package day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Listen";
		String s2="siLent";
		
		if (s1.length()!=s2.length())
		{
			System.out.println("Both the given Strings are not anagaram");
		}
		else
		{
			System.out.println("Both the given Strings are anagram");
		}
		System.out.println("Lets check the given strings are anagram");
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("After Sorting-->");
		System.out.println(c1);
		System.out.println("After Sorting-->");
		System.out.println(c2);
		
		boolean b1=Arrays.equals(c1, c2);
		System.out.println(b1);
		if(b1==true)
		{
		 System.out.println("The given string are anagram");
		}
		else
		{
			System.out.println("The given string are not anagram");
		}
		
	}

}
