package day1;
interface Facebook
{
	void add();
	void sub();
}

interface Def extends Facebook
{
	void mul();
	void div();
}

public class Interface_Multilevel implements Def {

	public static void main(String[] args) {
		Interface_Multilevel IM= new Interface_Multilevel();
		IM.add();
		IM.sub();
		IM.mul();
		IM.div();

	}

	
	public void add() 
	{
		int a=98;
		int b=100;
		System.out.println(a+b);
		
	}

	
	public void sub()
	{
		int a=25;
		int b=74;
		System.out.println(a-b);
		
		
	}

	
	public void mul()
	{
		int a=15;
		int b=46;
		System.out.println(a*b);
		
	}

	
	public void div() 
	{
		int a=74;
		int b=2;
		System.out.println(a/b);
		
		
	}

}
