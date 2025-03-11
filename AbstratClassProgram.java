package day1;

 abstract class ParentClass1
{
	abstract void add(); 
	abstract void sub();
	
	public void myMethod() {
		System.out.println("hy I am non abstrat method in abstract class");
	}
	
}

public class AbstratClassProgram extends ParentClass1
{
	
	
      public static void main(String[] args) {
    	  AbstratClassProgram abc=new AbstratClassProgram();
    	  abc.add();
    	  abc.sub();
    	  abc.myMethod();
    	  
}

	void add() 
	{
		int a=10;
		int b=34;
		System.out.println(a+b);
	}

	void sub() 
	{
		int a=52;
		int b=66;
		System.out.println(a-b);
		
	}

}
