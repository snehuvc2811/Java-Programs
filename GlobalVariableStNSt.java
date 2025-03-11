package day1;

public class GlobalVariableStNSt {

	static int a =87;
	static int b=400;
	int c=579;
	
	static void add()
	{
		System.out.println(a+b);
	}
	
	static void mul()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		GlobalVariableStNSt.add();
		GlobalVariableStNSt.mul();
		GlobalVariableStNSt gvnst=new GlobalVariableStNSt();
		System.out.println(a+b-gvnst.c);
	}

}
