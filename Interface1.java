package day1;

interface Flipkart
{
	void div();
	void mul();
	
}

public class Interface1 implements Flipkart {

	public static void main(String[] args) 
	{
		Interface1 i=new Interface1();
		i.div();
		i.mul();

	}

	
	public void div()
	{
		
		int a=25;
		int b= 55;
		System.out.println(a/b);
	}

	
	public void mul()
	{
		int a=67;
		int b=89;
		System.out.println(a*b);
		
	}

}
