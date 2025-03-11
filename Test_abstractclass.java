package day1;

abstract class Student1
 {
	 abstract void print();
	 abstract void display();
 }
public class Test_abstractclass extends Student1 {

	public static void main(String[] args) {
		Test_abstractclass Tab=new Test_abstractclass();
		Tab.print();
		Tab.display();
		Tab.show();
		
	}

	
	void print() {
		 
		System.out.println("Print 1");
	}

	
	void display() {
		
		System.out.println("Display 1");
	}
	
    void show()
    {
    	System.out.println("show  1");
    }

}
