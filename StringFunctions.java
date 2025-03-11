package day1;

public class StringFunctions {

	public static void main(String[] args) {
		
		String a="sneha";
		String b="VIKAS";
		String c="My  name  is  Sneha";
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		int a1=a.length();
		System.out.println(a1);
		
		int c1=c.length();
		System.out.println(c1);
		
		System.out.println(b.charAt(4));
		System.out.println(a.charAt(3));
		String d="  Good Morning    students   ";
		System.out.println(d);
		System.out.println(d.trim());
	}

}
