package day1;

public class Access_Specifier_method1 {

	public void add()
	{
		int a=25;
		int b=68;
		System.out.println(a+b);
	}
	
	private void sub()
	{
		int a=56;
		int b=28;
		System.out.println(a-b);
	}
	
    protected void mul()
	{
		int a=97;
		int b=68;
		System.out.println(a*b);
	}
	
	 void div()
	{
		int a=49;
		int b=7;
		System.out.println(a/b);
	}


	public static void main(String[] args) {
		
		Access_Specifier_method1 ac=new Access_Specifier_method1();
		ac.add();
		ac.mul();
		ac.div();
		ac.sub();
		
	}

}

