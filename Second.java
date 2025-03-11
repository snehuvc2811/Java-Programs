package day1;

public class Second{
	 MethodOverloading M;
	
	Second(){
		M=new MethodOverloading();
	}
	
	public static void main(String[] args) {
		Second s=new Second();
		s.M.add("Sneha");
		s.M.add('S');	
	}
}
