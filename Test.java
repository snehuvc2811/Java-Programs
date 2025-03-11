package day1;

public class Test extends Parents{
	
	Test()
	{
		this("Sneha");
		System.out.println("First Constructor" + "age");
	}
	
	Test(String name)
	{
		super(1);
		System.out.println("Second Constructor " +name );
	}
	Test(int age)
	{
		this();
		//super(age);
		System.out.println("Third Constructor"+age);
	}

	public static void main(String[] args) {
		int age=14;
		new Test(++age);
		System.out.println(age);


	}

}
class Parents{
	
	Parents(){
		System.out.println("p1");
	}
	Parents(int x){
		this();
		System.out.println("p2"+x);
	}
}
