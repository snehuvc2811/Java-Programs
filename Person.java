package day2;

import java.util.Scanner;

class Person
{
public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age of the Person");
	    int age=sc.nextInt();	
	    System.out.println("Enter the gender of the Person");
	    char gender=sc.next().charAt(0);
	
	    if(age>18 && gender=='F')
	    {
	     System.out.println("Person is eligible to vote");
	    }
	   else
	    {
	     System.out.println("Person is not eligible to vote");
	    }
	
	}
	

}
