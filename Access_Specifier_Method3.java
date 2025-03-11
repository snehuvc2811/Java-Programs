package day1;

public class Access_Specifier_Method3 {

	public void add()
	{
		int a=34;
		int b=56;
		System.out.println(a+b);
	}
	private void sub()
	{
		int a=85;
		int b=56;
		System.out.println(a-b);
	}
	protected void mul()
	{
		int a=85;
		int b=56;
		System.out.println(a*b);
	}
    void div()
	{
		int a=85;
		int b=56;
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Access_Specifier_Method3 ACM3=new Access_Specifier_Method3();
		ACM3.add();
	
		
		
	}

}
