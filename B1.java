package day2;
import day1.*;

public class B1 {
	
	public static void main(String[] args) {
		
		Access_Specifier_Method3 ACM3=new Access_Specifier_Method3();
		ACM3.add();
		//ACM3.div();//default method not accessible in other package 
		//ACM3.sub();//private method not accessible in other package
		//ACM3.mul();//protected method not accessible in other package

	}

}
