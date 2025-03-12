package day2;

public class StringBuilderFunctions {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Geeks for Geeks");
		sb.append(" is a java course");
		System.out.println(sb);
		
		sb.insert(5, "and-");
		System.out.println("After replace string is " +sb);
		
		sb.replace(1, 6, "mmmm");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Package");
		sb1.delete(1, 4);
		System.out.println(sb1);
		
		
		System.out.println(sb1.capacity());
		
		StringBuilder sb2=new StringBuilder("Today is Monday");
		System.out.println(sb2.substring(1, 6));
		
	}

}
