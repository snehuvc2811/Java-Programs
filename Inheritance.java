package day1;

class Animal
{
   String name="Leo";
}

class Dog extends Animal
{
	int legs=4;
	int tail=1;
}
public class Inheritance {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		System.out.println("The name of the Dog is: "+d.name);
		System.out.println("No. of legs dog has: "+d.legs);
		System.out.println("No.of tail dog has: "+d.tail);
	}

}
