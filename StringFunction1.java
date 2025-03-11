package day1;

public class StringFunction1 {

	public static void main(String[] args) {
		String name="Sneha";
		System.out.println(name.concat(" Vikas Chaudhary"));
		
		String i1="Sneha";
		String i2="Vikas";
		String i3="Chaudhary";
		System.out.println(i1.concat(" ").concat(i2).concat(" ").concat(i3));
		
		String a="Vikas Kumar Chaudhary";
		boolean b=a.contains("Kumar Chaudhary");
		System.out.println(b);
	}

}
