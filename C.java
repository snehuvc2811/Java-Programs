package day2;
//Access modifiers for class
 class A
 {
   void add()
	{
	 System.out.println("Print 1");
	}
 }
 class B
 {
	void sub()
	{
		System.out.println("Print 2");
	}
 }
  class D
 {
	void mul()
	{
		System.out.println("Print 3");
	}
 }
  public class C {
	  public void div()
	  {
		  System.out.println("Print 4");
	  }
	
 public static void main(String[] args) {
		A a=new A();
		a.add();
		B b=new B();
		b.sub();
		D c=new D();
		c.mul();
		C c1=new C();
		c1.div();
	}
}
