package day2;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		
		 Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first,second number, third & forth number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt(); 
		int result=a+b+c+d;
		System.out.println("Addition of all the four numbers is: " +result);
		


	}

}
