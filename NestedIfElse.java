package day1;

public class NestedIfElse {

	public static void main(String[] args) {
	
		int a=3;
		
		if(a%2==0) {
			System.out.print("The given number is even and ");
			if(a<10)
			{
				System.out.println("less than 10");
			}
			else if(a>=10 && a<=50)
			{
				System.out.println("between 10 and 50");
			}
			else
			{
				System.out.println("greater than 50");
			}
				
			
		}else
		{
			System.out.print("The given number is odd and ");
			if(a<10)
			{
				System.out.println("less than 10");
			}
			else if(a>=10 && a<=50)
			{
				System.out.println("between 10 and 50");
			}
			else
			{
				System.out.println("greater than 50");
			}
				
		}
	}

}
