package day1;

public class FinalVariableTest {

	final static double pi=3.142;
	final static int r=5;
	

	public static void main(String[] args) {
		double pi=4.142;
		int r=15;
		double s=pi*r*r;
		System.out.println(s);
	}

}
