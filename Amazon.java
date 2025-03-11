package day1;
//Write a program for this calling statement
public class Amazon {
	//Amazon a1= new Amazon();
	int a=5;
	int b=20;
	Amazon()
	{
		this(2);
		
		System.out.println("This is 1");
	}
	Amazon(int a)
	{ 
		this("Sneha");
		System.out.println("This is 2");
	}
	Amazon(String name)
	{
		System.out.println("This is 3");
	}

	public static void main(String[] args) {
		new Amazon();
		Amazon a1= new Amazon();

	}

}

