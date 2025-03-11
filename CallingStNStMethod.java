package day1;

public class CallingStNStMethod {
	
	void add()
	{
		int a=52;
		int b=22;
		
		System.out.println(a+b);
	}
	 void sub()
	 {
		 int c=1066;
		 int d=96;
		 
		 System.out.println(c-d);
	 }
	static void mul()
	 {
		 int i=8;
		 int j=5;
		 System.out.println(i*j);
	 }
	
	public static void main(String[] args) {
		CallingStNStMethod Cns=new CallingStNStMethod();
		Cns.add();
		Cns.sub();
		CallingStNStMethod.mul();
		
		
	}

}
