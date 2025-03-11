package day1;


public class Access_Specifier_Method {
	public void add()
	{
		int a=45;
		int b=68;
		System.out.println(a+b);
	}
	
	private void sub()
	{
		int a=105;
		int b=28;
		System.out.println(a-b);
	}
	
	protected void mul()
	{
		int a=45;
		int b=68;
		System.out.println(a*b);
		
	}
	
	void div()
	{
		int a=67;
		int b=48;
		System.out.println(a/b);
	}


	public static void main(String[] args) {
		
		Access_Specifier_Method a=new Access_Specifier_Method();
		a.add();
		a.mul();
		a.div();
		a.sub();
		
		
		

	}

}
