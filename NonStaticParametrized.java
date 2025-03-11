package day1;

public class NonStaticParametrized {
	
	void divide(int a, int b)
	{
		System.out.println(a/b);
	}
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void sub(int i, int j)
	{
		System.out.println(i-j);
	}
	void mul(int i, int j)
	{
		System.out.println(i*j);
	}
	

	public static void main(String[] args) {
	
		NonStaticParametrized NSP =new NonStaticParametrized();
		NSP.divide(49,7);
		NSP.add(65,75);
		NSP.sub(200,75);
		NSP.mul(20,80);
	}

}
