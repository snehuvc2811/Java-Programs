package day1;

class Today
{
	void show(double salary)
	{
		System.out.println("The Salary is " +salary);
	}
}

class Tomorrow extends Today
{
	void display(int no)
	{
		System.out.println("The number displayed is " +no);
	}
}

class Overmorrow extends Today
{
	void Print(String name)
	{
		System.out.println("The name is " +name);
	}
}

public class HierarchyLevelInheritance {

	public static void main(String[] args) {

		Tomorrow t1=new Tomorrow();
		t1.display(1);
		t1.show(45.46);
		
		Overmorrow o= new Overmorrow();
		o.Print("Sneha");
		o.show(52.23);

	}

}
