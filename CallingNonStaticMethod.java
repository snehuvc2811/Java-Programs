package day1;

public class CallingNonStaticMethod {
	
	void addition()
	{
		int a=52;
		int b=89;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
	CallingNonStaticMethod C= new CallingNonStaticMethod();
	C.addition();

	}

}
