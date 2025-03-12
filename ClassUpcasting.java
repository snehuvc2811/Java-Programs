package day2;

public class ClassUpcasting {

	public static void main(String[] args) {
		Object o1= new ClassUpcasting();//implicit typecasting
		
		Object o2= (Object) new ClassUpcasting();// explicit typecasting
		
		ClassUpcasting cu1=(ClassUpcasting) o1;
		//Downcasting can be done only in explicit way
	}

}
