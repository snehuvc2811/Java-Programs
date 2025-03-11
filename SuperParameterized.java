package day1;
class Senior
{
	Senior()
	{
		System.out.println("Senior Non Parameterized constructor is executed");
	}
	
	Senior(int i)
	{
		System.out.println("Senior Parameterized constructor is executed");
	}
}
class Junior extends Senior
{
	Junior()
	
	{
		System.out.println("Junior Non Parameterized constructor is executed");
	}
	
	Junior(int n)
	{
		super(5);
		System.out.println("Junior Parameterized constructor is executed");
	}
}

public class SuperParameterized {

	public static void main(String[] args) {
		Junior J=new Junior(5);
		

	}

}
