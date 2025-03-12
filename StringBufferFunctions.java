package day2;

public class StringBufferFunctions {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Java");
		System.out.println(sb.capacity());
		
		sb.append("Course");
		System.out.println(sb);
		
		sb.insert(2, "Online");
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		StringBuffer str=new StringBuffer("Bank of India");
		System.out.println(str.substring(5));
		System.out.println(str.reverse());
		
		StringBuffer str1=new StringBuffer("Expectations");
		System.out.println(str1.replace(2, 6, "rama"));
		
	}

}
