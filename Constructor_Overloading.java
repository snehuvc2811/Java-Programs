
package day1;

public class Constructor_Overloading{
	
	Constructor_Overloading()
	{
		System.out.println("This is my first constructor");
	}
	
	Constructor_Overloading(int a)
	{
		System.out.println("This is my second constructor");
	}
	
	Constructor_Overloading(int a, String name)
	
	{
		System.out.println("This is my third constructor");
	}

	public static void main(String[] args) {
		
		
		new Constructor_Overloading();
		new Constructor_Overloading(55);
		new Constructor_Overloading(25, "Sneha");
		
	}

}
