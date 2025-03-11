package day1;

public class CallingNSMethod {

	void add()
	{
		int a=25;
		int b=36;
		
		System.out.println(a+b);
	}
	 void sub()
	 {
		 int c=66;
		 int d=96;
		 
		 System.out.println(c-d);
	 }
	 void mul()
	 {
		 int i=502;
		 int j=25;
		 System.out.println(i*j);
	 }
	
	
	public static void main(String[] args) {
		CallingNSMethod Cns=new CallingNSMethod();
		Cns.add();
		Cns.sub();
		Cns.mul();

	}

}
