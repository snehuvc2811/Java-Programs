package day2;

public class ReverseString {

	public static void main(String[] args)
	{
		String m="mother";
		String reverse="";
		for(int i=m.length()-1; i>=0; i--)
		{
			char c1= m.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);

	}

}
