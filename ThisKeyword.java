package day1;

public class ThisKeyword {
	
	int a;
	String name;
	double salary;
	
	void showsalary(int a, String name, double salary)
	{
		this.a=a;
		this.name=name;
		this.salary=salary;
		System.out.println("The roll no of employee is " +a);
		System.out.println("The name of employee is " +name);
		System.out.println("The salary of employee is " +salary);
	}

	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.showsalary(4, "Sneha", 4.5);
		System.out.println(tk.a);
		System.out.println(tk.name);
		System.out.println(tk.salary);
		
		

	}

}
