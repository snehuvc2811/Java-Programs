package day1;

class Parent
{
	void display(String name)
	{
		System.out.println("My name is " +name);
	}
}

class Child1 extends Parent
{
	void show(int a)
	{
		System.out.println("The number is " +a);
	}
}

class Child2 extends Child1
{
	void Print(int b)
	{
		System.out.println("The number is " +b);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Child2 c2=new Child2();
		c2.display("Sneha");
		c2.Print(56);
		c2.show(89);
		
		
	}

}
