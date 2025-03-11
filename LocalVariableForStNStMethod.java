package day1;

public class LocalVariableForStNStMethod {

	
	static void PrintName()
	{
		int a = 15;
		if (a>25)
		{
			System.out.println("My name is Sneha");
		}
		else 
		{
			System.out.println("My name is not Sneha");
		}
	}
	 
	void add()
	{
		int a=23;
		int b=45;
		int c=a+b;
		
		System.out.println(c);
		
	}
			 
	public static void main(String[] args) {
		
		LocalVariableForStNStMethod.PrintName();
		LocalVariableForStNStMethod LS = new LocalVariableForStNStMethod();
		LS.add();
	}

}
