package day1;

public class StaticParameterizedMethodCalling {
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	

	public static void main(String[] args) {
		
		StaticParameterizedMethodCalling.add(12, 25);
		StaticParameterizedMethodCalling.sub(888, 700);
		StaticParameterizedMethodCalling.mul(55, 58);

	}

}
