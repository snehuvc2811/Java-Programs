package day1;

public class MethodOverloading {

	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	static void add(int a, double b)
	{
		System.out.println(a+b);
	}
	 
	void add(String a)
	{
		System.out.println(a);
	}
	
	void add(char c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		MethodOverloading.add(4,5);
		MethodOverloading.add(8,5.8);
		MethodOverloading M=new MethodOverloading();
		//System.out.println(M.a);
		M.add("Sneha");
		M.add('S');

	}

}




