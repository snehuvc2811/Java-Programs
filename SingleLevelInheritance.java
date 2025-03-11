package day1;

 class A
{
	int a=24;
	void Print()
	{
		System.out.println("The value of a is " +a);
	}
	

}

class B extends A
{
	int b=300;
	void Show()
	{
		System.out.println("The value of b is " +b);
	}
}

public class SingleLevelInheritance {

public static void main(String[] args) {
		
		B bobj= new B();
		bobj.Print();
		bobj.Show();

}

}
