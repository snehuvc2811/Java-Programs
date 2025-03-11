package day1;

 class Parent2 {

	public void add()
	{
		int a=45;
		int b=24;
	    System.out.println(a+b);
	}
	void sub()
	{
		int a=45;
		int b=24;
	    System.out.println(a-b);
	}
	protected void mul()
	{
		int a=45;
		int b=24;
	    System.out.println(a*b);
	}
 }
class Child11 extends Parent2{
	private void div()
	{
		int a=45;
		int b=24;
		System.out.println(a/b);
	}
}
public class Access_Specifier_Method2 {
	public static void main(String[] args) {
		
		Child11 c=new Child11();
		c.add();
		//c.div();
		c.sub();
		c.mul();		
	}
}

