package day1;
 class Vehicle
 {
	 void Start()
	 {
		 System.out.println("Car is Starting");
	 }
 }
 
 class Car extends Vehicle
 {
	 void Start()
	 {
		 System.out.println("Car is not Starting");
	 }
 }
 
 public class MethodOverrirding {

	public static void main(String[] args) {
		Car c=new Car();
		c.Start();
		
		
	}

}
